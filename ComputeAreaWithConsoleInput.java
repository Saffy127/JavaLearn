import java.util.Scanner;

 public class ComputeAreaWithConsoleInput {
  public static void main(String[] args) {
    // Create a scanner object
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter the radius
    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();
    
    // Compute the area
    double area = radius * radius * 3.14159;

    // Display result
    System.out.println("The final area of the circle " + radius + " is " + area );  
  } 
 } 
