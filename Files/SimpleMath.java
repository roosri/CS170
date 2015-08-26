/**
 * Solution of SimpleMath
 * @author Khoa
 *
 */
import java.util.Scanner;

public class SimpleMath {

	/**
	 * main entry method
	 * @param args
	 */
	public static void main(String[] args) {
		
		// We use integer numbers for this demo
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		Scanner keyBoard = new Scanner(System.in);
		
		// Display instructions for inputs
		System.out.println("*** Simple Math Application ***");
		System.out.println();
		System.out.println("I will perform a few calculations for you.");
		System.out.println("Let's start...");
		System.out.println("Please enter two integer numbers:");
		
		// Input
		num1 = keyBoard.nextInt();
		num2 = keyBoard.nextInt();

		// Display output explainations
		System.out.println();
		System.out.println("These are the results:");
		
		// Processing - addition
		result = num1 + num2;
		
		// Output addition result
		System.out.println("Addition => (" + num1 + " + " + num2 + ") = " + result);
		
		// Processng - substraction
		result = num1 - num2;
		
		// Output addition result
		System.out.println("Subtraction => (" + num1 + " - " + num2 + ") = " + result);	

		// Processing - multiplication
		result = num1 * num2;
		
		// Output addition result
		System.out.println("Multiplication => (" + num1 + " * " + num2 + ") = " + result);					

		System.out.println();
		System.out.println("Thank you for using the Simple Math application.");
		
		// Close input stream
		keyBoard.close();
	}
}
