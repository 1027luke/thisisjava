package project.daycalc;

public class YearCalc {
	int yearsToDays (int sYear, int eYear){
		System.out.println(sYear+" "+eYear); 
		int daysInYear=0;
		int yearResult= eYear-sYear;
		daysInYear=yearResult*365;
		
		/*1.년도 두개 input으로 받음
		 * 2. 더한년도 뺌
		 3.값을 일수로 전환*/
		return daysInYear;
	}
}
