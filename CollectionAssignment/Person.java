package CollectionAssignment;

import java.util.*;

public class Person implements Comparable<Person> {

	int weight;
	int height;
	String name;

	public Person(int weight, int height, String name) {

		this.weight = weight;
		this.height = height;
		this.name = name;

	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public void display() {
		System.out.println("The weight is " + getWeight() + "  The height is "
				+ getHeight() + "   The name is " + getName());
	}

	@Override
	public int compareTo(Person person) {

		if (this.weight == person.getWeight()) {

			if (this.height == person.getHeight()) {
				return 0;
			} else if (this.height > person.getHeight()) {
				return 1;
			} else {
				return -1;
			}

		} else if (this.weight > person.getWeight()) {
			return 1;
		} else {
			return -1;
		}

	}
}
