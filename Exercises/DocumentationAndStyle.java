import java.util.Scanner;

public class DocumentationAndStyle {

  /**
   * A good programming practice to produce code that is:
   *    - Easy to read 
   *      - Easy to understand
   *      - Easy to maintain
   *      
   * @param args
   */
  
  public static final double PI = 3.14159;
  public static final double MORTGAGE_INTEREST_RATE = 6.5;
  
  public static void main(String[] args) {
    
    int x = 10, y=20, z;  // inconsistent
    
    // too general calculation
    z = x*y;  // difficult to read
    z = x * y;  // easy to read
    
    // Choose descriptive variable names
    // Initialize variables with default values
    // Provide meaningful comments
    int rectangleArea = 0;  // in square feet
    int width = 10;     // in feet
    int length = 20;    // in feet
    
    rectangleArea = width * length;  // self-documenting code - no need to provide comments
    
    ////////////////////
    // Named constants
    ////////////////////
    
    double radius = 13.9; // in inches
    double area;      // in square inches
    
    area = 3.14159 * radius * radius; // what is 3.14159?
    area = 3.14 * radius * radius;    // somewhere else in the program
    
    System.out.println("radius * radius = " + (radius * radius)+ " radius**2 = " + Math.pow(radius, 2));

    // Named constant - assign a literal value to a variable and make this value unchanged. 
    // 1) Use a named constant when a value is known and unchanged. E.g.
    //    public static final double PI = 3.14159;    // final means final value - no change    
    // 2) Constants are written all in upper case letters to differentiate them from variables
    // 3) If there are more than one word, separate the words by underscore
    // 4) A Constant has to be initialized when it is declared
    //    public static final double MORTGAGE_INTEREST_RATE = 6.5
    //      public static final double MAX_AMOUNT = 100.0
    
    area = PI * radius * radius;    // easier to understand and ensure consistency 
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a principle amount: ");
    double principle = keyboard.nextDouble();
    
    double balance = principle + (MORTGAGE_INTEREST_RATE * principle) / 12;   
    
    System.out.println("Balance amount: " + balance);
    
    keyboard.close();
    
    // Some benefits for using named constants
    // 1) Ensue consistency
    // 2) Clarity - easier to read and understand
    // 3) Facilitate changes globally
    //    E.g Change MORTGAGE_INTEREST_RATE = 6.5 to MORTGAGE_INTEREST_RATE = 7.65
  }

}
