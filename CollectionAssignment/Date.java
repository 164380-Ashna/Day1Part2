package CollectionAssignment;

import java.util.HashMap;

import java.util.Set;

public class Date extends MyDate {

	public Date(int dd, int mm, int yyyy) {
		super(dd, mm, yyyy);

	}

	/*public boolean SameDay(MyDate date1, MyDate date2) {
		if (date1.getDd() == date2.getDd()) {
			return true;
		} else
			return false;
	}

	public boolean SameMonth(MyDate date1, MyDate date2) {
		if (date1.getMm() == date2.getMm()) {
			return true;
		} else
			return false;
	}
*/
	public static void main(String args[]) {
		
		MyDate date1=new MyDate(16,07,1994);
		MyDate date2=new MyDate(16,07,1996);
		MyDate date3=new MyDate(17,03,1995);
		MyDate date4=new MyDate(07,05,1998);
		MyDate date5=new MyDate(06,05,1974);
		
		HashMap<MyDate, String> employee=new HashMap<>();
		
		
		
		employee.put(date1, "Ashu");
		employee.put(date2, "Ross");
		employee.put(date3, "Shubham");
		employee.put(date4, "Adarsh");
		employee.put(date5, "Seema");
		
		
		
		Set<MyDate> keys=employee.keySet();
		for(MyDate myd: keys){
			
			
			
		}
	/*	
	Set<MyDate> keys=employee.keySet();
	for(MyDate myd: keys){
		
		if(sameDay(employee.get(keys)))
		System.out.println(myd+":"+employee.get(myd));
	}*/
	
		
		
		
	}	
	
		
		
		
		
}

		
	


