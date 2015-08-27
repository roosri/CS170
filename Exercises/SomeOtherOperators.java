
public class SomeOtherOperators {

  /**
   * Demo some other operators:
   *   modulus or remainder operator %
   *   increment ++
   *   decrement --
   *   += 
   *   -=
   *   *=
   *   /=
   * @param args
   */
  public static void main(String[] args) {
    // modulus operator %
    System.out.printf("%d/d = %d\n", 14, 4, 14/4);
    System.out.printf("%d%%%d = %d\n", 14, 4, 14%4);
    //System.out.printf("%d%%%d = %d\n", -14, 4, -14%4);
    //System.out.printf("%d%%%d = %d\n", 14, -4, 14%-4);
    
    // modulus operator is usually used with integer operands, but
    // Java does allow to use it with float-point operands
    System.out.printf("%.2f%%%.2f = %.2f\n", 6.5, 2.0, 6.5%2.0);
    //System.out.printf("%.2f%%%.2f = %.2f\n", -6.5, 2.0, -6.5%2.0);
    //System.out.printf("%.2f%%%.2f = %.2f\n", 6.5, -2.0, 6.5%-2.0);
    
    // increment ++
    int amount = 5;
    amount++;   // equivalent amount = amount + 1 or amount += 1
    System.out.printf("amount++ is equivalent to amount = amount + 1 = %d\n", amount);
        
    
    // decrement --
    amount--;     // equivalent amount = amount - 1 or amount -= 1
    System.out.printf("amount-- is equivalent to amount = amount - 1 = %d\n", amount);
    
    // +=
    amount += 5;  // equivalent amount = amount + 5
    System.out.printf("amount += 5 is equivalent to amount = amount + 5 = %d\n", amount);
    
    // -=
    amount -=5;  // equivalent amount = amount - 5
    System.out.printf("amount -= 5 is equivalent to amount = amount - 5 = %d\n", amount);

    // *=
    amount *=5;  // equivalent amount = amount * 5
    System.out.printf("amount *= 5 is equivalent to amount = amount * 5 = %d\n", amount);   

    // /=
    amount /=5;  // equivalent amount = amount / 5
    System.out.printf("amount /= 5 is equivalent to amount = amount / 5 = %d\n", amount); 
    
    double doubleNum = 5.5;
    doubleNum++;
    System.out.printf("doubleNum++ is equivalent to doubleNum = doubleNum + 1 = %.2f\n", doubleNum);
        
        int x = 2;
        x *= x + 1;
        System.out.printf("x *= x + 1 is " + (x *= x + 1));
        
        
        
  }

}
