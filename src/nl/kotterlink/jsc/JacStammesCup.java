/**
 * 
 */
package nl.kotterlink.jsc;


/**
 * @author tim
 *
 */
public class JacStammesCup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Creating the ArrayList for the object team.
//		List<Team> listPAGD = new ArrayList<Team>();
//		List<Team> listPBGD = new ArrayList<Team>();
//		List<Team> listPCGD = new ArrayList<Team>();

		Pool pagd = new Pool("PAGD");
		Pool pbgd = new Pool("PBGD");
		Pool pcgd = new Pool("PCGD");

		//PAGD stands for Poule A Gemengd D.
		Team teamPAGD1 = new Team("FIQAS Aalsmeer JD");
		Team teamPAGD2 = new Team("Quintus");
		Team teamPAGD3 = new Team("Houten");
		Team teamPAGD4 = new Team("Gemini");

		pagd.addTeam(teamPAGD1);
		pagd.addTeam(teamPAGD2);
		pagd.addTeam(teamPAGD3);
		pagd.addTeam(teamPAGD4);
		
		//PBGD stands for Poule B Gemengd D.
		Team teamPBGD1 = new Team("FIQAS Aalsmeer MD");
		Team teamPBGD2 = new Team("E en O");
		Team teamPBGD3 = new Team("Kras Volendam D3");
		Team teamPBGD4 = new Team("Internos");
		
		pbgd.addTeam(teamPBGD1);
		pbgd.addTeam(teamPBGD2);
		pbgd.addTeam(teamPBGD3);
		pbgd.addTeam(teamPBGD4);

		//PCGD stands for Poule C Gemengd D.
		Team teamPCGD1 = new Team("Handbalschool Brabant");
		Team teamPCGD2 = new Team("Klink-Nijland Kwiek");
		Team teamPCGD3 = new Team("Kras Volendam D1");
		Team teamPCGD4 = new Team("Succes VOC Amsterdam");

		pcgd.addTeam(teamPCGD1);
		pcgd.addTeam(teamPCGD2);
		pcgd.addTeam(teamPCGD3);
		pcgd.addTeam(teamPCGD4);
		
		pagd.printPool();
		pbgd.printPool();
		pcgd.printPool();
		
		//Adding the teams to the listPAGD.
//		listPAGD.add(teamPAGD1);
//		listPAGD.add(teamPAGD2);
//		listPAGD.add(teamPAGD3);
//		listPAGD.add(teamPAGD4);

		//Adding the teams to the listPBGD.
//		listPBGD.add(teamPBGD1);
//		listPBGD.add(teamPBGD2);
//		listPBGD.add(teamPBGD3);
//		listPBGD.add(teamPBGD4);

		//Adding the teams to the listPCGD.
//		listPCGD.add(teamPCGD1);
//		listPCGD.add(teamPCGD2);
//		listPCGD.add(teamPCGD3);
//		listPCGD.add(teamPCGD4);

		//show the listPAGD items in the console output.
//		for (Team team : listPAGD) {
//			System.out.println(team);
//		}
//		System.out.println();

		//show the listPbGD items in the console output.
//		for (Team team : listPBGD) {
//			System.out.println(team);
//		}
//		System.out.println();

		//show the listPAGD items in the console output.
//		for (Team team : listPCGD) {
//			System.out.println(team);
//		}

	}
}
