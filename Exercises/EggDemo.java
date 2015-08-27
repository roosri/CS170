import java.util.Scanner;

/**
 * Demo code for today lecture prototype
 * @author ktran426
 *
 */
public class EggDemo {

  public static void main(String[] args) {
    
    Scanner keyBoard = new Scanner(System.in);
    
    System.out.println("How many eggs are in the basket?");
    int eggsPerBasket = keyBoard.nextInt();
    
    System.out.print("How many baskets are there?\n");
    int numberOfBaskets = keyBoard.nextInt();
    
    int totalEggs = eggsPerBasket * numberOfBaskets;
    
    System.out.println("You have a total of " + totalEggs + ".");
        
  }

}
