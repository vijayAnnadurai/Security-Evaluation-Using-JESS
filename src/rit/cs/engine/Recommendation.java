package rit.cs.engine;

import rit.cs.model.KnowledgeBase;

/**
 * program to calculate the metrics percent using the formula.
 * Results are set to the working memory.
 */
public class Recommendation {

	// KnowledgeBase base = new KnowledgeBase();

	public void conversionOfMetrics(KnowledgeBase base) {
		float vulnerabilityMgmt;
		float AccessCtrl;
		float IdentifyAuthentification;
		float RiskAssess;
		float Incident;
		float physical;

		
		vulnerabilityMgmt = ((float)base.getVulnerabilitiesmitigated() / base
				.getVulnerabilitiesidentified()) * 100;

		AccessCtrl = ((float)base.getUnauthorizedAccess() / base.getRemoteaccesspoints()) * 100;
		IdentifyAuthentification = ((float)base.getSharedaccounts()/base.getAccesstosystem())*100;
		RiskAssess = ((float)base.getVulnerabilitiesremediatedpoam()/base.getVulnerabilitiesidentifiedpoam())*100;
        Incident = ((float)base.getIndividualscreened()/base.getIndividualsaccess())*100;
        physical = ((float)base.getAllowedunauthorisedentries()/base.getIncidentsoccured())*100;

        if(vulnerabilityMgmt>=100)
            vulnerabilityMgmt = 100;
        if(AccessCtrl>=100)
            AccessCtrl = 100;
        if(IdentifyAuthentification>=100)
            IdentifyAuthentification = 100;
        if(RiskAssess>=100)
            RiskAssess = 100;
        if(Incident>=100)
            Incident = 100;
        if(physical>= 100)
            physical = 100;
        base.setVulnerabilityMgmt(vulnerabilityMgmt);
        base.setAccessCtrl(AccessCtrl);
        base.setIdentifyAuthentification(IdentifyAuthentification);
        base.setRiskAssess(RiskAssess);
        base.setIncident(Incident);
        base.setPhysical(physical);
        
        System.out.println( "access "+base.getAccessCtrl());
        System.out.println("identAuth "+base.getIdentifyAuthentification());
        System.out.println("risk "+base.getRiskAssess());
        System.out.println("incident "+base.getIncident());
        System.out.println("phy "+base.getPhysical());
	}

}
