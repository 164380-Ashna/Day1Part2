package com.ashna.oops;


public class Employee {

	protected boolean isManager;
	protected boolean isLabour;

	protected String eName;
	int employeeid;
	
	public Employee(String eName, int employeeid, boolean isManager, boolean isLabour) {
		this.eName = eName;
		this.employeeid = employeeid;
		this.isManager = isManager;
		this.isLabour = isLabour;
		
	}

	

	

	
	/*
	
	public void SalaryCalculation() {
		if (isManager) {
			System.out.println("Enter target:  ");
			int target=sc.nextInt();
			mg.incentive(target);
			double grossIncome = mg.salary + mg.increment;
			System.out.println("The salary of manager is:  "+grossIncome);
			
		} else if (isLabour) {
			System.out.println("Enter extra working hour:  ");
			double extraWorkingHour=sc.nextDouble();
			lb.overtime(extraWorkingHour);
			double grossIncome = lb.salary + lb.extraIncome;
			System.out.println("The salary of labour is:  "+grossIncome);
			
			
		} else {
			double grossIncome = 0;
			System.out.println("Not an employee  ");
		}

	}
	
	
	*/

	public static void main(String args[]) {
		
		//Manager mg = new Manager("Ashna", 123, true, false);
		//Labour lb = new Labour("Baby", 321, false, true);
		//Employee emp1 = new Employee("Ashna", 123, true, false);
		//Employee emp2 = new Employee("Baby", 321, false, true);
		//emp1.SalaryCalculation();
		//emp2.SalaryCalculation();
		Manager mg = new Manager("Ashna", 123, true, false); 
		mg.SalaryCalculation();
		
		
		
		Labour lb = new Labour("Baby", 321, false, true);
		lb.SalaryCalculation();

	}

}


