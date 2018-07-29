import java.util.Random;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		favColor("red");

	}

	public static void favColor(String color) {
		
		switch (color) {
		case "red":
			System.out.println("red");
			break;
		case "green":
			System.out.println("green");
			break;
		case "purple":
			System.out.println("green");
			break;	
		default:
			System.out.println("We don't have that color");
			break;	
			
		}
	}
}
