package project.daycalc;

public class MonthsCalculator {
	int getDays(int month){
		int daysInMonth=0;
		if (month>=1){
			daysInMonth=31;
		}
		if(month>=2){
			daysInMonth+=28;
		}
		if (month>=3){
			daysInMonth+=31;
		}
		if (month>=4){
			daysInMonth=30;
		}
		if (month>=5){
			daysInMonth=31;
		}
		if (month>=6){
			daysInMonth=30;
		}
		if (month>=7){
			daysInMonth=31;
		}
		if (month>=8){
			daysInMonth=31;
		}
		if (month>=9){
			daysInMonth=30;
		}
		if (month>=10){
			daysInMonth=31;
		}
		if (month>=11){
			daysInMonth=30;
		}
		if (month>=12){
			daysInMonth=31;
		}
		
		return daysInMonth;
	}
	
}
