package thisisjava.chap06;

import java.util.Scanner;

public class LifeOfWorkerMain { 

	public static void main(String[] args) { 

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
		Scanner scanner= new Scanner(System.in);
		System.out.println("Welcome to Life of a worker");
		System.out.println("Please choose your race"+ " 1.Asian" + " 2.European" + " 3.African");
		int RaceOption=0;
		HumanWorker worker1= null;


		 
		while (true){
			if(scanner.hasNextInt()){
				RaceOption = scanner.nextInt();
			}
			if (RaceOption==1){

				worker1= new AsianWorker();
				break;
			}
			else if (RaceOption==2){

				worker1 = new EuropeanWorker();
				break;
			}

			else if (RaceOption==3){

				worker1= new AfricanWorker();
				
				break;
			}

			else {
				System.out.println("Invalid Option");

			}
		}
			
		
		//2. Create worker & print Worker's current status
		System.out.println(worker1.m_survivalDay);
		System.out.println(worker1.m_hp);
		System.out.println("Race="+worker1.getRace());
		while (true){


			worker1.PrintStatus();

			//3. Print what actions you want to make worker do
			worker1.PrintActions();	

			//4. Recieve input from user (action)
			int action= worker1.RecieveActions(scanner);

			//5. Execute the action
			worker1.ExecuteActions(action);
			//6. Check end conditon
			int condition = worker1.CheckEndCondition();

			if (condition<0){
				break;
			}
		}
	}

}
