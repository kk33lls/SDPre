import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    //Scanning for input from user
    System.out.println("What's your first name?");
    String fname = keyboard.nextLine();
    System.out.println("What's your last name?");
    String lname = keyboard.nextLine();
    System.out.println("What's your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();
    System.out.println("What's your favorite food?");
    String favoriteFood = keyboard.nextLine();
    System.out.println("What's your favorite song?");
    String favoriteSong = keyboard.nextLine();

    //Print the output formatted to look like the expected output using String concatenation.
    System.out.println("My name is " + fname + "  " + lname + ".");
    System.out.println("My favorite animal is " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
    
    keyboard.close();
  }
}