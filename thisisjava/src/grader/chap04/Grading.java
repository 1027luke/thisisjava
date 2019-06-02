package grader.chap04;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***Welcome to Grade Evaluator***");
		System.out.println("Please enter your score:");

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();


		if (x>=90){
			System.out.println("Your grade is A");	
		}
		else if (x>=80){
			System.out.println("Your grade is B");
		}
		else if (x>=70){
			System.out.println("Your grade is C");
		}
		else if (x>=60){
			System.out.println("Your grade is D");
		}
		else if (x>=50){
			System.out.println("Your grade is E");
		}
		else if ((x<50) && (x>=0)){
			System.out.println("Your grade is F");
		}
		else 
		{
			System.out.println("Invalid score has been detected. Please use score between 0 to 100 only");
		}

		in.close();
	}

}	


