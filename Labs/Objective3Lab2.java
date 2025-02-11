public class Objective3Lab2{
    public static void main(String[] args) {
    double side1 = 10.0;
    double side2 = 8.0;
    
    double hypotenuse =  Math.hypot(side1, side2);

    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
}

}
