package thisisjava.chap06; //encapsulates gorup of classes

import java.io.IOException; //import from this library (소스코드 없다고 봐도 무방)
import java.util.Scanner;	// import from this library

public class LifeOfWorkerMain { //creates class called LifeOfWorkerMain 

	public static void main(String[] args) { //runs program in this method 스태틱이 있어야 실행가능 (프로그램이 시작 동시에 메모리에 올라가게 된다)

		// TODO Auto-generated method stub
		/*1. Print greetings
		 * 2. Create worker & print Worker's current status
		 * 2.1 Select Race
		 * 3. Print what actions you want to make worker do
		 * 4. Recieve input from user (action)
		 * 5. Execute the action
		 * 6. Check end conditon
		 * */
		//1. Print greetings
		Scanner scanner= new Scanner(System.in); //creates scanner class
		System.out.println("Welcome to Life of a worker"); //system이란 변수가 이미 선언됬음 print this string
		System.out.println("Please choose your race"+ " 1.Asian" + " 2.European" + " 3.African"); //print this string
		int RaceOption=0; //declares int type variable RaceOption
		HumanWorker worker1= null; // worker1이라는 변수 생성, 오브젝트는 아님
		



		while (true){ //enters while loop
			RaceOption= ConsoleInputFetcher.GetPositiveInt();
			if (RaceOption==1){ //입력값이 1일때

				worker1= new AsianWorker(); //
				break; //escapes loop
			}
			else if (RaceOption==2){ //

				worker1 = new EuropeanWorker(); //
				break; //escapes loop
			}

			else if (RaceOption==3){ //

				worker1= new AfricanWorker(); //

				break; //escapes loop
			}

			else { //if input value satisfies none of the conditions 
				System.out.println("Invalid Option"); //print this string

			}
		}


		//2. Create worker & print Worker's current status
		System.out.println(worker1.m_survivalDay); //print value m_survivalday
		System.out.println(worker1.m_hp); //print value m_hp
		System.out.println("Race="+worker1.getRace()); //print string "Race" and input value  
		while (true){ //enters while loop everytime

			worker1.PrintStatus(); 

			//3. Print what actions you want to make worker do
			worker1.PrintActions();	

			//4. Recieve input from user (action)
			int action= worker1.RecieveActions(); //declares int type variable "action" &스캐너 값 호출

			//5. Execute the action
			worker1.ExecuteActions(action); //스캐너랑 ㅇ
			//6. Check end conditon
			int condition = worker1.CheckEndCondition();

			if (condition<0){  
				break; //escape
			} 
		}
	}
}
