package thisisjava.chap06;

import java.util.Scanner;

public class HumanWorker {
	public int m_hp; 
	public int m_mp;
	public int m_money; 
	public int m_survivalDay;
	public  String m_race;
	



	HumanWorker(){

		m_hp=10;
		m_mp=10;
		m_money=100;
		m_survivalDay=1;
		

	}
	public void PrintStatus(){

		System.out.println("hp:" + m_hp);
		System.out.println("mp:" + m_mp);
		System.out.println("money:" + m_money);
		System.out.println("survival day" + m_survivalDay);
	}
	void PrintActions(){
		System.out.println("Please enter what actions you will make the worker to take");
		System.out.println("1.eat" +"2.sleep" +"3.work");
	}

	int RecieveActions(Scanner scanner){

		int action = 0;
		if(scanner.hasNextInt()){
			action = scanner.nextInt();
		}


		return action;
	}
	

	void ExecuteActions(int action){
		switch(action){

		case 1:
			eat();
			break;

		case 2:
			sleep();
			break;

		case 3:
			work();
			break;

		default:
			System.out.println("Action undefined:" + action);
			break;
		}
	}
	void eat(){
		m_hp= m_hp+2;
		m_money= m_money-2;
		System.out.println("You ate!");
		System.out.println("Your hp was increased by 2");
		System.out.println("Your money was decreased by 2");
	}
	void sleep(){
		m_mp= m_mp+2;
		m_money= m_money-2;
		m_survivalDay=m_survivalDay+1;
		System.out.println("You slept!");
		System.out.println("Your mp was increased by 2");
		System.out.println("Your moneny was decreased by 2");
		System.out.println("New day begins");
	}
	void work(){
		m_money= m_money+2;
		m_mp= m_mp-2;
		m_hp= m_hp-2;
		System.out.println("You worked!");
		System.out.println("Your money was increased by 2");
		System.out.println("Your mp was decreased by 2");
		System.out.println("YOur hp was increased by 2");
	}
	
	
	int CheckEndCondition(){

		if(m_hp<=0){

			return -1;
		}
		else if(m_mp<=0){

			return -2;
		}
		else if(m_money<=0){

			return -3;
		}
		else if(m_survivalDay>=100){

			return -4;
		}
		else {
			return 0;
		}
	}


	String getRace(){
		return m_race;
	}
}
