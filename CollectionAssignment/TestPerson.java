package CollectionAssignment;

import java.util.*;

public class TestPerson {

	public static void main(String args[]) {

		TreeSet<Person> tr = new TreeSet<Person>();

		Person person1 = new Person(60, 152, "Ross");
		Person person2 = new Person(55, 154, "Chandler");
		Person person3 = new Person(65, 150, "Rachel");
		Person person4 = new Person(70, 162, "Monica");
		Person person5 = new Person(70, 169, "Phoebe");

		tr.add(person1);
		tr.add(person2);
		tr.add(person3);
		tr.add(person4);
		tr.add(person5);

		for (Person person : tr)
			person.display();

	}

}
