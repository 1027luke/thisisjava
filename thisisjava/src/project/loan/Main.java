package project.loan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.����ݾ�, ���� ���±ݾ�, ������, �Է¹ޱ�
		 * 2����ݾ��� 0�̵ɶ����� �����ݾ��� ���⸦ �ݺ� 
		 3.�ɸ��ð� �����ֱ�*/
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

		double d=FindNumbers.getNumbers(a, b, c); //���Ѱ��� ������ ������ �����ؾߵǴµ� Ʋ���� �����ϴ�.

		while (a>=b){//���� ������ �� �ȵ��� ������ ã�����Դϴ�
			d=FindNumbers.getNumbers(a, b, c);
			time+=1;
		}

		System.out.println("Money borrowed: "+moneyBorrowed);
		System.out.println("Money paid back monthly: "+payPerMonth);
		System.out.println("Interest rate: "+interestRate);
		System.out.println("It took "+time+" months to pay all the loans");
	}

}
