public class PrintfDemo {

  /**
   * Demo for printf - Print Formatting
   * 
   * System.out.printf(“format-string”[, arg1, arg2, … ]); 
   * 
   * format-string:
   * "%[flags][width][.precision]conversion-character"   
   * 
   * flags:
   * - : left-justify ( default is to right-justify )
     * + : output a plus ( + ) or minus ( - ) sign for a numerical value
     * 0 : forces numerical values to be zero-padded (default is blank padding)
     * , : comma grouping separator (for numbers > 1000)
     *   : space will display a minus sign if the number is negative or  
     *     a space if it is positive
     *     
   * width: minimum number of characters to be displayed.
   * precision: number of digits of precision when outputting floating-point values or 
   *            the length of a substring to extract from a String
     * Conversion-Characters:
     *   d : decimal integer [byte, short, int, long]
     *   f : floating-point number [float, double]
     *   c : character Capital C will uppercase the letter
     *   s : String Capital S will uppercase all the letters in the string
     *   h : hashcode A hashcode is like an address. This is useful for printing 
     *       a reference
     *   n : newline Platform specific newline character - use %n instead of 
     *       \n for greater compatibility
   * 
   * @param args
   */
  public static void main(String[] args) {
    
    int priceInt = 9;
    double price = 9.5987654321;
    System.out.println("Price using println: " + price);
        System.out.printf("Price using printf: %s%n", price);
    System.out.printf("Price using printf: %f%n", price);     // by default number of decimal point is 6
    //System.out.printf("Price using printf: %f%n", priceInt); // error
    System.out.printf("Price using printf: %d%n", priceInt);
    System.out.printf("Price using printf: %.2f%n", price);
    System.out.printf("Price using printf: %6.2f\n", price);  // What about number of digits > 6
        System.out.printf("Price using printf: %6.2f\n", price*123456789.45);  // What about number of digits > 6
    System.out.printf("Price using printf: %-6.2f\n", price); // - : left justify format
    //System.out.printf("Price using printf: %-.2f\n", price); // - : left justify format error
    System.out.printf("Price using printf: %+6.2f\n", price); // Print plus sign + if the number is positive; - if negative
    System.out.printf("Price using printf: %+.2f\n", price);
    //System.out.printf("9.5%2 = %.2f\n", 9.5%2); Error
    
    // Combine multiple format specifier into a single string
    int quantity = 2;
    String item = "Widgets";
    System.out.printf("%s sold: %d at $%.2f. Total = $%1.2f\n", item, quantity, price, quantity * price);
    
    // Some other format specifiers
    System.out.printf("%s\n", "hello");
    System.out.printf("%S\n", "hello");   // print string in upper case
    System.out.printf("%c\n", 'a');
    System.out.printf("%C\n", 'a');     // print char in upper case
    System.out.printf("%e\n", 504598.58);   // exponential format
    System.out.printf("%b\n", 2 < 1);
  }

}
