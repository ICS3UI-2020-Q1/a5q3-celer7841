import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a variable to keep track of what number we are on 
    int count = 1;
    // the accumulator to mutliply the count into
    int total = 1;
    while(count <= 11){
      // mutliply the numbers as we go into total
      total = total * count;
      // mutliply 1 to our count to increase it 
      count = count + 1;
    }
      // print the total to the screen 
    System.out.println("Please enter an integer to calculate the factorial of"); 
    System.out.println("The total is " + total);

  }
}