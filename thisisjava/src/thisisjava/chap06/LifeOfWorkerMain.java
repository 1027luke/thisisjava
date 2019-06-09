package thisisjava.chap06;

import java.util.Scanner;

public class LifeOfWorkerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. Print greetings
		 * 2. Create worker & print Worker's current status
		 * 3. Print what actions you want to make worker do
		 * 4. Recieve input from user (action)
		 * 5. Execute the action
		 * 6. Check end conditon
		 * */
		//1. Print greetings
		System.out.println("Welcome to Life of a worker");

		//2. Create worker & print Worker's current status
		HumanWorker worker1= new HumanWorker();
		while (true){
			

			worker1.PrintStatus();

			//3. Print what actions you want to make worker do
			worker1.PrintActions();	

			//4. Recieve input from user (action)
			int action= worker1.RecieveActions();

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
