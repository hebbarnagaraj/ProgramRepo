package mathsPrograms;

import java.util.LinkedList;

public class ReverseLinedlist {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> reversedlist = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(40);
		
		list.descendingIterator().forEachRemaining(reversedlist::add);
		
		System.out.println("Reversed linkedlist is:"+reversedlist);
		
	}

}
