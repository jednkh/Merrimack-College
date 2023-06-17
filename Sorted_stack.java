import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;
/**
 * Takes integer inputs from the user,
 * stores them in a Stack, and sorts it.
 * @author Pedro Torres
 * @version 1.0.0
 */
public class Sorted_stack {
	/**
	 * Main creates a scanner, a Stack,
	 * and creates boolean 'done' set to false.
	 * A while loop adds integers to the Stack
	 * until the user types exit. The unsorted 
	 * Stack is printed, then sorted and printed.
	 * @param args the command line arguments - none
	 * @since Week 5 of CSC6301 10 June 2023
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>(); 
		Boolean done = false;
		while (!done) {
			System.out.println("Enter an integer, type exit when done: ");
			if (sc.hasNext("exit")) {
				System.out.println("\nExiting...Printing Stack unsorted:"); 
		        break;
			}
			st.push(sc.nextInt());
			sc.reset();
		}
		sc.close();
		System.out.println(st);
		Collections.sort(st);
		System.out.println("\nStack sorted:");
		System.out.println(st);
	}
}