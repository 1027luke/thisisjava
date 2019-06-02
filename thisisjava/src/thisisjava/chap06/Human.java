package thisisjava.chap06;

public class Human {
	
	//1.member variable
	int m_age;
	String m_sex;
	String m_name;
	int m_hp;
	int m_int;
	
	//2. function or method
	
	
	//Constructor , 생성자 함수
	Human(int age, String sex, String name)
	{
		m_age = age;
		m_sex = sex;
		m_name = name;
		
		m_hp = 100;
		m_int = 10;
	}
	

	void tellMeYourAge()
	{
		System.out.println(m_age);
	}
	
	void tellMeYourSex()
	{
		System.out.println(m_sex);
	}
	
	void tellMeYourName()
	{
		System.out.println(m_name);
	}
	
	void tellMeYourHP()
	{
		System.out.println(m_name + ": My hp is " +  m_hp);
	}
	
	void tellMeYourInt()
	{
		System.out.println(m_name + ": My int is " +  m_int);
	}
	
	void study()
	{
		m_hp -= 1;
		m_int += 1;
		System.out.println(m_name + ": I am now studying");
	}
	
}
