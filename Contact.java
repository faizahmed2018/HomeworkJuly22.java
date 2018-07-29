
public class homeWork {

	public static void main(String[] args) {
		System.out.println((newContact("Farhad", "(425) 999-9999")));
		System.out.println((newcontact("Faiz")));

	}

	public static String newContact(String name, String phoneNum) {

		return name + " " + phoneNum;

	}

	public static String newcontact(String name) {

		return newContact(name, "unknown");

	}

}
