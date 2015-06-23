/**
 * 
 */
package rit.cs.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Program to get the system parameters from the Windows system.
 * For other OS, value is set as "High"
 * @author krrish
 *
 */
public class GetSystemStatus {

	/**
	 * @param
	 * @throws IOException
	 */
	public void retrieveSecurityStatus(KnowledgeBase base)
	{

		String osName = System.getProperty("os.name");

		if(osName.startsWith("Windows")) {

			String op = null;
			String antivirus="no";

			String firewall = "no";
			try {
				Runtime rt = Runtime.getRuntime();
				// to get firewall status
				Process pr = rt.exec("netsh advfirewall show currentprofile");

				BufferedReader in = new BufferedReader(new InputStreamReader(
						pr.getInputStream()));

				while ((op = in.readLine()) != null) {
					if (op.contains("ON"))

					{
						firewall = "yes";
						System.out.println("firewall "+firewall);
						break;
					}
				}

				// to get antivirus status
				Process pr1 = rt.exec("WMIC /Node:localhost /Namespace:\\\\root\\SecurityCenter2 Path AntiVirusProduct Get displayName /Format:List");

				in = new BufferedReader(new InputStreamReader(pr1.getInputStream()));


				while((op=in.readLine()) != null) {
					if (op.contains("defender")||op.contains("anti")||op.contains("anti-virus"));
					{
						antivirus="yes";
						System.out.println(antivirus);
						break;
					}
				}

			} catch (Exception e) {
				System.out.println(e.toString());
				e.printStackTrace();
			}

			base.setFirewall(firewall);
			base.setAntivirus(antivirus);
		}
		else {

			base.setFirewall("yes");
			base.setAntivirus("yes");
		}



	}


}
