import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    // Part 1:
    // Prompt the user to provide one number and store their input in num1
     System.out.print("Please give me a number: ");
		num1 = kb.nextDouble();

    // Part 2:
    // Prompt the user for another number and store their input in num2
    System.out.print("Please give me another number: ");
		num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();
			//Part 3: Use switch to generate appropriate return value 
			switch (choice) {
		case 1: // Find sum
			System.out.println(num1 + " + " + num2 + " = " + findSum(num1, num2));
			break;
		case 2:// Find average
			System.out.println("The average of " + num1 + " and " + num2 + " is: " + findAverage(num1, num2));
			break;
		case 3:// Calculate tax
			System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + calcTax(num1, num2));
			break;
		case 4:// Exit
			System.out.println("You've chosen to quit.");
			System.exit(1);
		default: //any non 1-4 key
			System.out.println("Invalid entry. Please try again");
			break;
			}
		}
		kb.close();

	}

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}
	// findSum method
	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;	
	}
  // findAverage method
  public static double findAverage(double x, double y){
  	double average = (x + y) / 2;
  	return average;
  }
  // calcTax method
  public static double calcTax(double x, double y){
  	double sum = x + y;
  	double calcTax = sum * 0.0831;
  	return calcTax;
  }


}