package Self;
import java.util.*;

public class Linkedlist_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(10);
		ll.add(9);
		ll.add(8);
		ll.add(7);
		ll.add(6);
		
		Collections.reverse(ll);
		
		System.out.println(ll);
		
		/* Type -2
		 * LinkedList<Integer> reversedList = new LinkedList<>();
		 * 
		 * for (Integer item : ll) { reversedList.addFirst(item); }
		 * 
		 * System.out.println("Reversed list: " + reversedList);
		 */
		
	}

}
