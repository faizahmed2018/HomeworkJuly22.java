public class homeWork {

	public static void main(String[] args) {
		Login("bman", "gothamKnight");
		Login("supes", "batmanSucks");
		Login("ollie", "boxingGloveArrows");
		//Login("noname", "gothamKnight");
	}

	public static void Login(String Username, String password) {

		switch (Username) {
		case "bman":
			System.out.println("");
			break;

		case "supes":
			System.out.println("");
			break;

		case "ollie":
			System.out.println("");
			break;

		default:
			System.out.println("Your credentials are either incorrect or invalid.");
			break; // More Code here

		}

		switch (password) {
		case "gothamKnight":
			System.out.println("Welcome Batman. You now have access to the Batcave files.");
			break;

		case "batmanSucks":
			System.out.println("Welcome Superman. You now have access to the Fortress of Solitude files.");
			break;

		case "boxingGloveArrows":
			System.out.println("Welcome Green Arrow. You now have access to the Fortress of Solitude files.");
			break;

		default:
			System.out.println("Your credentials are either incorrect or invalid.");
			break; // More Code here

		}

	}
}
