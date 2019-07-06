package project.loan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.대출금액, 월별 갚는금액, 이자율, 입력받기
		 * 2대출금액이 0이될때까지 월별금액을 뺴기를 반복 
		 3.걸린시간 말해주기*/
		Scanner scanner = new Scanner(System.in);
		int time=0;
		System.out.println("Enter the amount of loan");
		String moneyBorrowed= scanner.nextLine();
		double a= Double.parseDouble(moneyBorrowed);
		System.out.println("Enter the amount you can pay monthly");
		String payPerMonth=scanner.nextLine();
		double b= Double.parseDouble(payPerMonth);
		System.out.println("Enter the interest rate");
		String interestRate=scanner.nextLine();
		double c=Double.parseDouble(interestRate);

		double d=FindNumbers.getNumbers(a, b, c); //구한값을 저장할 변수를 선언해야되는데 틀린거 같습니다.

		while (a>=b){//현재 루프가 왜 안도는 중인지 찾는중입니다
			d=FindNumbers.getNumbers(a, b, c);
			time+=1;
		}

		System.out.println("Money borrowed: "+moneyBorrowed);
		System.out.println("Money paid back monthly: "+payPerMonth);
		System.out.println("Interest rate: "+interestRate);
		System.out.println("It took "+time+" months to pay all the loans");
	}

}
