
public class TypeCast {

  /**
   * TypeCast Demo
   * @param args
   */
  public static void main(String[] args) {
    
    byte byteNum = 0;     // 1 byte  -127 to 127
    short shortNum = 0;     // 2 bytes -32,786 to 32,786
    int intNum = 0;       // 4 bytes
    long longNum = 0;     // 8 bytes -9,223,372,036,854,775,807 to +9,223,372,036,854,775,807
    
    float floatNum = 0.0f;    // 4 bytes +- 3.40282347e38 +- 1.40239846e-45
    double doubleNum = 0.0;   // 8 bytes
    
    char   c = '\u0000';    // 2 bytes unicode value for a blank
    boolean b = false;      // 1 bit   true/false
    
    longNum = 123;
    
    System.out.println(23.8%12);
    
    //System.out.println("Does float have bigger range of values? " + (1.40282347e38 > 9223372036854775807l));
    
    // Assign smaller range data type to bigger range data type - NO PROBLEM
    byteNum = 125;
    shortNum = byteNum;
    System.out.println("byteNum = " + byteNum + " shortNum = " + shortNum);
    
    // Assign bigger range data type to smaller range data type - DATA LOSS
    shortNum = 240;
    //byteNum = shortNum;        // illegal IDE or compiler will catch it
    byteNum = (byte)shortNum;  //type cast changes the data type of a value
    System.out.println("byteNum = " + byteNum + " shortNum = " + shortNum);
    
    // 125 = 0111 1101
    // Two complement: 
    // Flip all the bits -> 1000 0010 
    // Then add 1 -> 1000 0011 -> -125    MSB = 1 -> negative number
    // 240 -> 1111 0000
    
    // Casting a character to an integer
    char symbol = '1';
    System.out.println("Casting '" + symbol + "' to int = " + (int) symbol);
    
    //System.out.println("Default values byteNum = " + byteNum + " shortNum = " + shortNum + " intNum = " + intNum + 
    //               " floatNum = " + floatNum + " doubleNum = " + doubleNum +
    //               " char c = " + c + " boolean b = " + b);
    
    double dinnerBill = 26.99;
    int bill = (int) dinnerBill;
    // bill is set to 26 not 27. The result is not rounded
    System.out.println("dinnerBill = " + dinnerBill + " bill = " + bill);
    
    System.out.println("11.0/3 = " + 11.0/3);
    System.out.println("11/3 = " + 11/3 + " The fractional part is ignored");   
    
//    If the int variable x contains 10, what will the following Java statements display?
//    System.out.println("Test 1" + z * 3 * 2.0);
//    System.out.println("Test 2" + z * 3 + 2.0);
//    Given these results, explain why the following Java statement will not compile:
//    System.out.println("Test 3" + z * 3 - 2.0)
    int z = 10;
    //System.out.println("Test 1: " + z * 3 * 2.0);
    //System.out.println("Test 2: " + z * 3 + 2.0);
    //System.out.println("Test 3: " + (z * 3 - 2.0));

    /*    
      If u = 2, v = 3, w = 5, x = 7, and y = 11, what is the value of each of the following  expressions, assuming int variables?
        • u + v * w + x
        • u + y % v * w + x
        • u++ / v + u++ * w
    */
    int u = 2;
    int v = 3;
    int w = 5;
    int x = 7;
    int y = 11;
    
    //System.out.println("u + v * w + x = " + (u + v * w + x));
    //System.out.println("u + y % v * w + x = " + (u + y % v * w + x));
    //System.out.println("u++ / v + u++ * w = " + (u++ / v + u++ * w));   
    
    int n = 3;
    int m = 4;
    // Increase m by one first then do multiplication
    System.out.println("n = " + n + " m = " + m + " n*(++m) = " + (n*(++m)));
    n = 3;
    m = 4;  
    // Do multiplication first then increase m by one first  
    System.out.println("n = " + n + " m = " + m + " n*(m++) = " + (n*(m++)));
      
  }

}
