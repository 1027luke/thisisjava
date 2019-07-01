package thisisjava.chap06;

import java.util.Scanner;

public class HumanWorker {
	public int m_hp; 
	public int m_mp;
	public int m_money; 
	public int m_survivalDay;
	public  String m_race;
	public double m_workMastery;



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
		System.out.println("1.eat" +" 2.sleep" +" 3.work"+" 4.gamble" );
	}

	int RecieveActions(){

		return ConsoleInputFetcher.GetPositiveInt();
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
		
		case 4:
			gamble();
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
		m_money=(int) (m_money+m_workMastery);
		m_workMastery= 1.1*m_workMastery;
		m_mp= m_mp-2;
		m_hp= m_hp-2;
		System.out.println("You worked!");
		System.out.println("Your money was increased by 2");
		System.out.println("Your mp was decreased by 2");
		System.out.println("YOur hp was increased by 2");
	}
	void gamble(){
		System.out.println("Choose your game:"+" 1.Rock,Papaer,Scissors"+" 2.Black Jack") ;
		int action=0;
		action=ConsoleInputFetcher.GetPositiveInt();
		if(action==1){
			System.out.println("Let's play Rock,Paper,Scissors");
			/*System.out.println("Please select among rock, papaer, or scissors");
			System.out.println("1.Rock 2.Paper 3. Scissors");*/
			HumanGamble gamble= new HumanGamble();
			System.out.println("Please select amount of money you want to bet:");
			int betMoney=0;
			betMoney=ConsoleInputFetcher.GetPositiveInt();
			int gameResult= gamble.RockPaperScissors();
				if(gameResult==1){
					System.out.println("win!");
					m_money=m_money+betMoney;
				}
				else if (gameResult==2){
					System.out.println("draw!");
				}
				else if (gameResult==3){
					System.out.println("defeat!");
					m_money=m_money-betMoney;
				}
			//이겼을경우 배팅의 두배, 비겼을경우 그대로, 졌을경우 배팅금액만큼 -
			// int배팅하면 2배의 돈을 m_money에 넣어줌, 지면 배팅한 금액만큼 m_money-, 비길시 변화없음 (if문으로 구현)
		}
		else if(action==2){
			System.out.println("Let's play Black Jack");
		}
		
		
	}
	
	
	int CheckEndCondition(){

		if(m_hp<=0){
			
			System.out.println("You died");
			return -1;
		}
		else if(m_mp<=0){
			System.out.println("You died");
			return -2;
		}
		else if(m_money<=0){

			return -3;
		}
		else if(m_survivalDay>=100){
			System.out.println("Victory");
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
