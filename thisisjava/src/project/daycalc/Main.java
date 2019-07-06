package project.daycalc;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String startDay=scanner.nextLine();
		System.out.println("Starting Day is: " + startDay);
		System.out.println("Enter end date: ");
		String endDay=scanner.nextLine();
		System.out.println("Ending Day is: "+ endDay); 
		int dayResult =Integer.parseInt(endDay)-Integer.parseInt(startDay); 
		System.out.println("Remaining Days: "+dayResult);
		System.out.println("Please enter starting month: ");
		String startMonth=scanner.nextLine();
		System.out.println("Starting month is: " + startMonth);
		System.out.println("Please enter ending month: ");
		String endMonth=scanner.nextLine();
		System.out.println("Ending month is :"+endMonth);
		int monthResult=Integer.parseInt(endMonth)-Integer.parseInt(startMonth);
		System.out.println("Remaining Months: "+monthResult);
		System.out.println("Please enter starting year: ");
		String startYear=scanner.nextLine();
		System.out.println("Starting year is: "+startYear);
		System.out.println("Please enter ending year: ");
		String endYear=scanner.nextLine();
		System.out.println("Ending year is :"+endYear);
		//int yearResult=Integer.parseInt(endYear)-Integer.parseInt(startYear);

		/*String number2 = "11";
			int result = Integer.parseInt(number2);			
			System.out.println(result);*/
		MonthsCalculator mcalc= new MonthsCalculator();
		int totalStartDay= mcalc.getDays(Integer.parseInt(startMonth)-1)+Integer.parseInt(startDay);
		int totalEndDay= mcalc.getDays(Integer.parseInt(endMonth)-1)+Integer.parseInt(endDay);
		int totalResult=totalEndDay-totalStartDay;
		YearCalc ycalc= new YearCalc();
		int yearResult= ycalc.yearsToDays(Integer.parseInt(startYear),Integer.parseInt(endYear));
		System.out.println(yearResult+totalResult);
	}

}
