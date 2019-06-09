package thisisjava.chap06;

import java.util.Scanner;

public class HumanWorker {
	int m_hp; 
	int m_mp;
	int m_money; 
	int m_survivalDay;
	Scanner m_in;

	HumanWorker(){

		m_hp=10;
		m_mp=10;
		m_money=100;
		m_survivalDay=1;
		m_in = new Scanner(System.in);

	}
	void PrintStatus(){

		System.out.println("hp:" + m_hp);
		System.out.println("mp:" + m_mp);
		System.out.println("money:" + m_money);
		System.out.println("survival day" + m_survivalDay);
	}
	void PrintActions(){
		System.out.println("Please enter what actions you will make the worker to take");
		System.out.println("1.eat" +"2.sleep" +"3.work");
	}

	int RecieveActions(){
		
		int action = 0;
		if(m_in.hasNextInt()){
			action = m_in.nextInt();
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
		System.out.println("You slept!");
		System.out.println("Your mp was increased by 2");
		System.out.println("Your moneny was decreased by 2");
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
}
