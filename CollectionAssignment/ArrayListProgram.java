package CollectionAssignment;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListProgram {

	public static void main(String args[]) {

		ArrayList arraylist=new ArrayList();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(5);
		arraylist.add(25);
		arraylist.add(2);
		arraylist.add(70);
		arraylist.add(30);
		System.out.println("Normal order");
		System.out.println(arraylist);
		
		ListIterator litr=arraylist.listIterator(arraylist.size());
		System.out.println("Reverse order");
		while(litr.hasPrevious()) {
			
			System.out.println(litr.previous());
		}
		
		
	}
}
