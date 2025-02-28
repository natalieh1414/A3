import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		// call menu method
		menu();
	}
	
	//convert kilometers to m
	public static void showKilometers(double meters) {
		
		double kilometers = meters *  0.001;
		System.out.println(meters + " meters is " + kilometers + " kilometers.");
	}
	
	//inches method
	public static void showInches(double meters) {
		
		double inches = meters *  39.37;
		System.out.println(meters + " meters is " + inches + " inches.");
	
	}
	
	//feet method
	public static void showFeet(double meters) {
		
		double feet = meters *  3.281;
		System.out.println(meters + " meters is " + feet + " feet.");
	
	}

	public static void menu() {
	
		//scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a distance in meters: ");
		double meters = input.nextDouble();
		int choice;
		
		do {
			//menu choices
			System.out.println("1. Convert to kilometers");
			System.out.println("2. Convert to inches");
			System.out.println("3. Convert to feet");
			System.out.println("4. Quit the program");
			
			//menu choice scanner
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			
			  switch (choice) {
		        case 1:
		            showKilometers(meters);
		            break;
		        case 2:
		            showInches(meters);
		            break;
		        case 3:
		            showFeet(meters);
		            break;
		        case 4:
		            System.out.println("Bye!");
		            break;
		        default:
		            System.out.println("Invalid choice.");
		            break;
		    }
		}	  while (choice != 4);
		
		//close scanner object
				input.close();
	}
}
