package CollectionAssignment;

import java.io.ObjectInputStream.GetField;

public class GenericDemo {

	public static void main(String args[]) {

		MyList<Employee> emp = new MyList<Employee>();
		emp.add(new Employee("Ashna", 123, 50000));
		emp.addthis();
		emp.add(new Employee("Shubham",456,1000000));
		emp.addthis();
		emp.removethis();
		emp.add(new Employee("Prince",789,10000));
		emp.addthis();
		
		
		MyList<BankAccount> bankacc = new MyList<BankAccount>();
		bankacc.add(new BankAccount("Ashna", 5000000, 12541));
		bankacc.addthis();
		bankacc.add(new BankAccount("Shubham",1000000,87546));
		bankacc.addthis();
		bankacc.removethis();
		bankacc.add(new BankAccount("Prince",10000,85886));
		bankacc.addthis();

		
		System.out.println("  "+ emp.get());
		System.out.println("  "+ emp.getAll());
		System.out.println("   "+ bankacc.get());
		System.out.println("   "+ bankacc.getAll());

	}

}
