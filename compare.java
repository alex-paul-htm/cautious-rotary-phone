import java.util.Scanner;

public class Exercise2 {
  public static void main(String args[]) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("First String: ");
    String firstString = input.nextLine();
    System.out.print("Same String or part of First String: ");
    String secondString = input.nextLine();
    //add code below this line
int same = firstString.compareTo(secondString);
boolean contain = firstString.toLowerCase().contains(secondString.toLowerCase());
    //System.out.println(same); //dev only debug
    if (same == 1) {
      System.out.println("The strings are equal: false");
    }
else if (same ==0) {
  System.out.println("The strings are equal: true");
}
   if (contain == true) {
     System.out.println("string two is contained in string one: true");
   }
      if (contain == false) {
     System.out.println("string two is contained in string one: false");
   }
    
  }
}