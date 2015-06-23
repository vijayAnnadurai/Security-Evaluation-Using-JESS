package rit.cs.model;

import java.io.Serializable;

public class KnowledgeBase implements Serializable{
	private int vulnerabilitiesmitigated;
	private int remoteaccesspoints;
	public int unauthorizedAccess;

	
	private int sharedaccounts;
	private int accesstosystem;
	private int vulnerabilitiesidentifiedpoam;
	private int vulnerabilitiesremediatedpoam;
	private int vulnerabilityscans;
	private int individualsaccess;
	private int individualscreened;
	private int incidentsoccured;
	private int allowedunauthorisedentries;
	private int vulnerabilitiesidentified;
	private float vulnerabilityMgmt;
	private String automatedtools;
	private String intrusiondetection;
	private String securitydb;
	private String firewall ;
	private String Antivirus;
	private String periodicvul;
	private String periodicity;
	private String password;
	private String specialchars;
	private String moredigits;
	private String knowspassword;
	private String writingpassword;
	private String changepassword;
	private String ResultVulMgmt;
	private String ResultVulMgmtText;
	private String ResultequipSec;
	private String ResultequipSecText;
	private String ResultSystemSec;
	private String ResultSystemSecText;
	public String getResultVulMgmtText() {
		return ResultVulMgmtText;
	}
	public void setResultVulMgmtText(String resultVulMgmtText) {
		ResultVulMgmtText = resultVulMgmtText;
	}
	public String getResultequipSec() {
		return ResultequipSec;
	}
	public void setResultequipSec(String resultequipSec) {
		ResultequipSec = resultequipSec;
	}
	public String getResultequipSecText() {
		return ResultequipSecText;
	}
	public void setResultequipSecText(String rsultequipSecText) {
		ResultequipSecText = rsultequipSecText;
	}
	public String getResultSystemSecText() {
		return ResultSystemSecText;
	}
	public void setResultSystemSecText(String resultSystemSecText) {
		ResultSystemSecText = resultSystemSecText;
	}
	public String getResultRiskAccessText() {
		return ResultRiskAccessText;
	}
	public void setResultRiskAccessText(String resultRiskAccessText) {
		ResultRiskAccessText = resultRiskAccessText;
	}
	public String getResultUnauthAccessText() {
		return ResultUnauthAccessText;
	}
	public void setResultUnauthAccessText(String resultUnauthAccessText) {
		ResultUnauthAccessText = resultUnauthAccessText;
	}
	
	public String getResultAccessValText() {
		return ResultAccessValText;
	}
	public void setResultAccessValText(String resultAccessValText) {
		ResultAccessValText = resultAccessValText;
	}
	private String ResultRiskAccess;
	private String ResultRiskAccessText; 
	private String ResultUnauthAccess;
	private String ResultUnauthAccessText;
	private String ResultPwd;
	public String getResultPwdText() {
		return ResultPwdText;
	}
	public void setResultPwdText(String resultPwdText) {
		ResultPwdText = resultPwdText;
	}
	private String ResultPwdText;
	
	private String ResultAccessVal;
	private String ResultAccessValText;
	private float AccessCtrl;
	
	private float IdentifyAuthentification;
	
	public String getResultVulMgmt() {
		return ResultVulMgmt;
	}
	public void setResultVulMgmt(String resultVulMgmt) {
		ResultVulMgmt = resultVulMgmt;
	}
	public String getResultquipSec() {
		return ResultequipSec;
	}
	public void setResultquipSec(String resultquipSec) {
		ResultequipSec = resultquipSec;
	}
	public String getResultSystemSec() {
		return ResultSystemSec;
	}
	public void setResultSystemSec(String resultSystemSec) {
		ResultSystemSec = resultSystemSec;
	}
	
	public String getResultRiskAccess() {
		return ResultRiskAccess;
	}
	public void setResultRiskAccess(String resultRiskAccess) {
		ResultRiskAccess = resultRiskAccess;
	}
	public String getResultUnauthAccess() {
		return ResultUnauthAccess;
	}
	public void setResultUnauthAccess(String resultUnauthAccess) {
		ResultUnauthAccess = resultUnauthAccess;
	}
	public String getResultPwd() {
		return ResultPwd;
	}
	public void setResultPwd(String resultPwd) {
		ResultPwd = resultPwd;
	}
	public String getResultAccessVal() {
		return ResultAccessVal;
	}
	public void setResultAccessVal(String resultAccessVal) {
		ResultAccessVal = resultAccessVal;
	}
	
	public float getAccessCtrl() {
		return AccessCtrl;
	}
	public void setAccessCtrl(float accessCtrl) {
		AccessCtrl = accessCtrl;
	}
	public float getIdentifyAuthentification() {
		return IdentifyAuthentification;
	}
	public void setIdentifyAuthentification(float identifyAuthentification) {
		IdentifyAuthentification = identifyAuthentification;
	}
	public float getRiskAssess() {
		return RiskAssess;
	}
	public void setRiskAssess(float riskAssess) {
		RiskAssess = riskAssess;
	}
	public float getIncident() {
		return Incident;
	}
	public void setIncident(float incident) {
		Incident = incident;
	}
	public float getPhysical() {
		return physical;
	}
	public void setPhysical(float physical) {
		this.physical = physical;
	}
	private float RiskAssess;
	
	
	private float Incident;
	private float physical;

	
	
	
	public int getUnauthorizedAccess() {
		return unauthorizedAccess;
	}
	public void setUnauthorizedAccess(int unauthorizedAccess) {
		this.unauthorizedAccess = unauthorizedAccess;
	}
	
	public float getVulnerabilityMgmt() {
		return vulnerabilityMgmt;
	}
	public void setVulnerabilityMgmt(float vulnerabilityMgmt) {
		this.vulnerabilityMgmt = vulnerabilityMgmt;
	}
	public String getFirewall() {
		return firewall;
	}
	public void setFirewall(String firewall) {
		this.firewall = firewall;
	}
	public String getAntivirus() {
		return Antivirus;
	}
	public void setAntivirus(String antivirus) {
		Antivirus = antivirus;
	}
	public String getAutomatedtools() {
		return automatedtools;
	}
	public void setAutomatedtools(String automatedtools) {
		this.automatedtools = automatedtools;
	}
	public String getIntrusiondetection() {
		return intrusiondetection;
	}
	public void setIntrusiondetection(String intrusiondetection) {
		this.intrusiondetection = intrusiondetection;
	}
	public String getSecuritydb() {
		return securitydb;
	}
	public void setSecuritydb(String securitydb) {
		this.securitydb = securitydb;
	}
	public String getPeriodicvul() {
		return periodicvul;
	}
	public void setPeriodicvul(String periodicvul) {
		this.periodicvul = periodicvul;
	}
	public String getPeriodicity() {
		return periodicity;
	}
	public void setPeriodicity(String periodicity) {
		this.periodicity = periodicity;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSpecialchars() {
		return specialchars;
	}
	public void setSpecialchars(String specialchars) {
		this.specialchars = specialchars;
	}
	public String getMoredigits() {
		return moredigits;
	}
	public void setMoredigits(String moredigits) {
		this.moredigits = moredigits;
	}
	public String getKnowspassword() {
		return knowspassword;
	}
	public void setKnowspassword(String knowspassword) {
		this.knowspassword = knowspassword;
	}
	public String getWritingpassword() {
		return writingpassword;
	}
	public void setWritingpassword(String writingpassword) {
		this.writingpassword = writingpassword;
	}
	public String getChangepassword() {
		return changepassword;
	}
	public void setChangepassword(String changepassword) {
		this.changepassword = changepassword;
	}
	
	public int getVulnerabilitiesidentified() {
		return vulnerabilitiesidentified;
	}
	public void setVulnerabilitiesidentified(int vulnerabilitiesidentified) {
		this.vulnerabilitiesidentified = vulnerabilitiesidentified;
	}
	public int getVulnerabilitiesmitigated() {
		return vulnerabilitiesmitigated;
	}
	public void setVulnerabilitiesmitigated(int vulnerabilitiesmitigated) {
		this.vulnerabilitiesmitigated = vulnerabilitiesmitigated;
	}
	public int getRemoteaccesspoints() {
		return remoteaccesspoints;
	}
	public void setRemoteaccesspoints(int remoteaccesspoints) {
		this.remoteaccesspoints = remoteaccesspoints;
	}
	public int getSharedaccounts() {
		return sharedaccounts;
	}
	public void setSharedaccounts(int sharedaccounts) {
		this.sharedaccounts = sharedaccounts;
	}
	public int getAccesstosystem() {
		return accesstosystem;
	}
	public void setAccesstosystem(int accesstosystem) {
		this.accesstosystem = accesstosystem;
	}
	public int getVulnerabilitiesidentifiedpoam() {
		return vulnerabilitiesidentifiedpoam;
	}
	public void setVulnerabilitiesidentifiedpoam(int vulnerabilitiesidentifiedpoam) {
		this.vulnerabilitiesidentifiedpoam = vulnerabilitiesidentifiedpoam;
	}
	public int getVulnerabilitiesremediatedpoam() {
		return vulnerabilitiesremediatedpoam;
	}
	public void setVulnerabilitiesremediatedpoam(int vulnerabilitiesremediatedpoam) {
		this.vulnerabilitiesremediatedpoam = vulnerabilitiesremediatedpoam;
	}
	public int getVulnerabilityscans() {
		return vulnerabilityscans;
	}
	public void setVulnerabilityscans(int vulnerabilityscans) {
		this.vulnerabilityscans = vulnerabilityscans;
	}
	
	public int getIndividualsaccess() {
		return individualsaccess;
	}
	public void setIndividualsaccess(int individualsaccess) {
		this.individualsaccess = individualsaccess;
	}
	public int getIndividualscreened() {
		return individualscreened;
	}
	public void setIndividualscreened(int individualscreened) {
		this.individualscreened = individualscreened;
	}
	public int getIncidentsoccured() {
		return incidentsoccured;
	}
	public void setIncidentsoccured(int incidentsoccured) {
		this.incidentsoccured = incidentsoccured;
	}
	public int getAllowedunauthorisedentries() {
		return allowedunauthorisedentries;
	}
	public void setAllowedunauthorisedentries(int allowedunauthorisedentries) {
		this.allowedunauthorisedentries = allowedunauthorisedentries;
	}
	
	
}
