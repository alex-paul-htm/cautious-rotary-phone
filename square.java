import java.util.Scanner;

public class Exercise4 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a whole number: ");
    int number = input.nextInt();
    
    //add code below this line
   System.out.println("Squared: " + Math.pow(number, 2));
    System.out.println("Square Rooted: "+Math.sqrt(number)); 


  }
}
