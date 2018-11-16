package com.ashna.oops;
import java.util.Scanner;

public class Labour extends Employee {

	Scanner sc1=new Scanner(System.in);
	
	protected double salary=20000;
	public double extraIncome;

	public Labour(String eName, int employeeid, boolean isManager,boolean isLabour) {

		super(eName, employeeid, isManager, isLabour);
		this.isLabour = true;
		

	}

	public boolean isLabour() {
		return isLabour;
	}

	public double overtime(int extraWorkingHour) {

		int increment;
		//double perDayIncome =(double) salary / 22;
		//double perHourIncome = (double)perDayIncome / 9;
		//double extraIncome = (double)(extraWorkingHour * 50);
		//return extraIncome;
		if(extraWorkingHour>0 && extraWorkingHour<2){
			 increment=100;
			return  increment;
		}
		
		else if(extraWorkingHour>=2 && extraWorkingHour<4){
			 increment=200;
			return  increment;
		}
		
		else if(extraWorkingHour>=4&& extraWorkingHour<=6){
			 increment=300;
			return  increment;
		}
		else {
			 increment=0;
			return  increment;
		}
		//return increment;
	}


	
	
	public void SalaryCalculation(){
		
		System.out.println("Enter extra working hour:  ");
		int extraWorkingHour=sc1.nextInt();
		overtime(extraWorkingHour);
		int grossIncome = salary + increment;
		System.out.println("The salary of labour is:  " +grossIncome);
	}

}
