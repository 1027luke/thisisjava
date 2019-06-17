package thisisjava.chap06;

public class EuropeanWorker extends HumanWorker{ 
	EuropeanWorker()
	{
		m_race="European";
		m_hp=15;
		m_mp=15;
	}
	public void PrintEuropeanGreetings(){
		System.out.println("Hi");
	}
}