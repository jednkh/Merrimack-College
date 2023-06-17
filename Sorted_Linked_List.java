import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Takes integer inputs from the user,
 * stores them in a LinkedList, and sorts it.
 * @author Pedro Torres
 * @version 1.0.0
 */
public class Sorted_Linked_List {
	/**
	 * Main creates a scanner, a LinkedList,
	 * and creates boolean 'done' set to false.
	 * A while loop adds integers to the Linkedlist
	 * until the user types exit. The unsorted 
	 * LinkedList is printed, then sorted before
	 * its printed again.
	 * @param args the command line arguments - none
	 * @since Week 4 of CSC6301 03 June 2023
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<Integer>(); 
		Boolean done = false;
		while (!done) {
			System.out.println("Enter an integer, type exit when done: ");
			if (sc.hasNext("exit")) {
				System.out.println("Exiting...Printing LinkedList unsorted:"); 
		        break;
			}
			ll.add(sc.nextInt());
			sc.reset();
		}
		sc.close();
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println("Printing LinkedList sorted:");
		System.out.println(ll);
	} 
}