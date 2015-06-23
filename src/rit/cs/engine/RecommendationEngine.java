package rit.cs.engine;

import java.util.Iterator;

import rit.cs.gui.Expertsystemop;
import rit.cs.model.KnowledgeBase;
import jess.Filter;
import jess.JessException;
import jess.Rete;
import jess.WorkingMemoryMarker;

/**
 * Program to run jess rules and set the values
 */
public class RecommendationEngine {

	private Rete engine;
	private WorkingMemoryMarker marker;

	KnowledgeBase base;
	public RecommendationEngine(KnowledgeBase base) throws JessException {
		engine = new Rete();
		engine.reset();

		engine.batch("rules.clp");

		// load facts into working memory

		engine.executeCommand("(assert (VulnerabilityMgmt(value "
				+ base.getVulnerabilityMgmt() + ")))");
		engine.executeCommand("(assert (EquipmentSecurity(value "
				+ base.getPhysical() + ")))");
		engine.executeCommand("(assert(RiskAssessment(value "
				+ base.getRiskAssess() + ")))");
		engine.executeCommand("(assert(IncidentReported(value "
				+ base.getIncident() + ")))");
		engine.executeCommand("(assert(Firewall(value "
				+ base.getFirewall().trim() + ")))");
		engine.executeCommand("(assert(Antivirus(value "
				+ base.getAntivirus().trim() + ")))");
		engine.executeCommand("(assert(UnauthorizedAccessPercent(value "
				+ base.getUnauthorizedAccess() + ")))");
		engine.executeCommand("(assert(passFreq (value " + base.getPassword()
				+ ")))");
		engine.executeCommand("(assert(pwdSplChar(value "
				+ base.getSpecialchars() + ")))");
		engine.executeCommand("(assert(pwdMoreChar(value "
				+ base.getMoredigits() + ")))");
		engine.executeCommand("(assert(accessCtrl (value "
				+ base.getAccessCtrl() + ")))");
		engine.executeCommand("(assert(automatedTools(value "
				+ base.getAutomatedtools() + ")))");
		engine.executeCommand("(assert(employIDS(value "
				+ base.getIntrusiondetection() + ")))");

		marker = engine.mark();

	}

	public void run(KnowledgeBase base) throws JessException {
		engine.resetToMark(marker);
		engine.run();

		String ResultVulMgmt = engine.getGlobalContext()
				.getVariable("*VulMgmt*").stringValue(null);
		String ResultquipSec = engine.getGlobalContext()
				.getVariable("*EquipSec*").stringValue(null);
		String ResultSystemSec = engine.getGlobalContext()
				.getVariable("*systemSec*").stringValue(null);
		
		String ResultRiskAccess = engine.getGlobalContext()
				.getVariable("*RiskAssess*").stringValue(null);
		String ResultUnauthAccess = engine.getGlobalContext()
				.getVariable("*UnauthAccess*").stringValue(null);
		String ResultPwd = engine.getGlobalContext()
				.getVariable("*PwdStrength*").stringValue(null);

		String ResultAccessVal = engine.getGlobalContext()
				.getVariable("*accessValue*").stringValue(null);

		System.out.println(engine.executeCommand("(facts)"));
		
		base.setResultAccessVal(ResultAccessVal.toUpperCase());
		base.setResultVulMgmt(ResultVulMgmt.toUpperCase());
		base.setResultequipSec(ResultquipSec.toUpperCase());
		base.setResultSystemSec(ResultSystemSec.toUpperCase());
		base.setResultRiskAccess(ResultRiskAccess.toUpperCase());
		base.setResultPwd(ResultPwd.toUpperCase());
		base.setResultUnauthAccess(ResultUnauthAccess.toUpperCase());

		System.out.println("equip "+ResultquipSec);
		


	}

}
