package rit.cs.engine;

import rit.cs.model.KnowledgeBase;

public class MetricsRecommendation {

	public void metricsRecommendation(KnowledgeBase base)
	{
		
		if(base.getResultVulMgmt().equalsIgnoreCase("low"))
		{
			String lowText = "Increase more frequent remediations of vulnerabilities.";
			base.setResultVulMgmtText(lowText);
		}
		if(base.getResultVulMgmt().equalsIgnoreCase("medium"))
		{
			String mediumText = "Apply patches more frequently to secure the system.";
			base.setResultVulMgmtText(mediumText);
		}
		if(base.getResultAccessVal().equalsIgnoreCase("low"))
		{
			String lowText = "Decrease the number of access points.";
			base.setResultAccessValText(lowText);
		}
		if(base.getResultAccessVal().equalsIgnoreCase("medium"))
		{
			String mediumText = "Keep track of unauthorized access.";
			base.setResultAccessValText(mediumText);
		}
		if(base.getResultPwd().equalsIgnoreCase("low"))
		{
			String lowText = " Change password frequently,use special characters and don't share it with anyone.";
			base.setResultPwdText(lowText);
		}
		if(base.getResultPwd().equalsIgnoreCase("medium"))
		{
			String mediumText = "Have password more than 6 characters and change it if any incident occurs";
			base.setResultPwdText(mediumText);
			
		}
		if(base.getResultequipSec().equalsIgnoreCase("low"))
		{
			String lowText = "Limit physical access to information systems and restrict operating environments to authorized individuals";
			base.setResultequipSecText(lowText);
		}
		if(base.getResultquipSec().equalsIgnoreCase("medium"))
		{
			String mediumText = "Provide the supporting utilities for information systems.";
			base.setResultequipSecText(mediumText);
		}
		if(base.getResultSystemSec().equalsIgnoreCase("low"))
		{
			String lowText = "Enable Firewall and antivirus to prevent malicious attacks.";
			base.setResultSystemSecText(lowText);
		}
		if(base.getResultSystemSec().equalsIgnoreCase("medium"))
		{
			String mediumText = "Update the firewall and antivirus softwares to make the system more secure";
			base.setResultSystemSecText(mediumText);
		}
		if(base.getResultRiskAccess().equalsIgnoreCase("low"))
		{
			String low = "Increase vulnerability scans periodicity";
			base.setResultRiskAccessText(low);
		}
		if(base.getResultRiskAccess().equalsIgnoreCase("medium"))
		{
			String medium = "Vulnerabilities should be corrected as per the POA&M schedule.";
			base.setResultRiskAccessText(medium);
		}
		if(base.getResultUnauthAccess().equalsIgnoreCase("low"))
		{
			String low = "Create an incident response team in the organization";
			base.setResultUnauthAccessText(low);
		}
		if(base.getResultUnauthAccess().equalsIgnoreCase("medium"))
		{
			String medium = "Track and report incidents to appropriate authorities.";
			base.setResultUnauthAccessText(medium);
		}
		
		
		
		
	}
	
	
	
}
