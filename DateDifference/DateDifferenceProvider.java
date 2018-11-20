package DateDifference;

public class DateDifferenceProvider {
	
	
	static final int JAN=31;
	static final int FEB=28;
	static final int MAR=31;
	static final int APR=30;
	static final int MAY=31;
	static final int JUN=30;
	static final int JUL=31;
	static final int AUG=31;
	static final int SEP=30;
	static final int OCT=31;
	static final int NOV=30;
	static final int DEC=31;
	
	int[] months={JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC};
	
	public static int getDifference(MyDate startDate, MyDate endDate){
		
		if(sameDate(startDate,endDate) && sameMonth(startDate,endDate)&& sameYear(startDate,endDate)){
			return 0;
		}
		else if ( sameMonth(startDate,endDate) && sameYear(startDate,endDate))
		
		
	}
	
	private boolean sameDate (MyDate startDate,MyDate endDate) {
		return endDate.getDd()==startDate.getDd();
			
	}

	private boolean sameMonth (MyDate startDate,MyDate endDate) {
		return endDate.getMm()==startDate.getMm();
			
	}
	
	private boolean sameYear (MyDate startDate,MyDate endDate) {
		return endDate.getYyyy()==startDate.getYyyy();
			
	}
	

}
