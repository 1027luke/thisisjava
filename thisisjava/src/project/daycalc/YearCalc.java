package project.daycalc;

public class YearCalc {
	int yearsToDays (int sYear, int eYear){
		System.out.println(sYear+" "+eYear); 
		int daysInYear=0;
		int yearResult= eYear-sYear;
		daysInYear=yearResult*365;
		
		/*1.�⵵ �ΰ� input���� ����
		 * 2. ���ѳ⵵ ��
		 3.���� �ϼ��� ��ȯ*/
		return daysInYear;
	}
}
