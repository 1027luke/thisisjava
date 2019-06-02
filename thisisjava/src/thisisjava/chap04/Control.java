package thisisjava.chap04;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int x= 76;
		if (x==100 ){
			System.out.println("A+");
		}
		else if (x>=90){
			System.out.println("A0");
		}
		else if (x>=77) {
			System.out.println("C+");}

		else {
			System.out.println("F");
		}

		switch (x){

		case 77:
			System.out.println("Your score is 77");
			break;
		default:
			System.out.println("default");
			break;
		}

		for (int i=1; i<=100; i++){
			System.out.println(i);
		}*/


		for (int age=1; age<=30; age++){
			if (age<10){
				System.out.println("baby");
			}
			else if ((age>=10)&& (age<20)){
				System.out.println("teenager");
			}
			else {
				System.out.println("adult");
			}			
		}

		int money= 100;
		while (money >=20){
			money= money-10;
			System.out.println(money);
			System.out.println("yum yum");
		}
		do{ 
		System.out.println("Please give me money");
		money= money+10;
		System.out.println(money);

		}while (money< 100);
		
		
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		System.out.println("Score:" +score);
	}
}




