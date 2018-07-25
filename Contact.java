
public class homeWork {

	public static void main(String[] args) {
		System.out.println((newContact("Farhad " , 42599999)));
		System.out.println((newcontact("unknown")));
		
	}

	public static String newContact(String name , int phoneNum) {
		
		return name + phoneNum ;
		
	}
	public static String newcontact(String name) {

		
		return name;
	
	}
	
}

