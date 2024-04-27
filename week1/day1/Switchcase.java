package week1.day1;

public class Switchcase {
	
	public static void main(String[] args) {
		//int Testvar =10;
		
		char carName = 'A';
		switch (carName) {
		case 'J' : System.out.println("Car name is Jaquar");
			break;
		case 'A' : System.out.println("Car name is Audi");
		break;
		default:
			System.out.println("Unable to find");
			
			break;
		}
	}

}
