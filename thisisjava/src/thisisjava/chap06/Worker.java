package thisisjava.chap06;

public class Worker {
	//Member variable- class variable
	//Gives information in a business card
	String m_name;
	String m_email;
	String m_tele;

Worker(String name, String email, String tele){
		m_name = name;
		m_email = email;
		m_tele = tele;
	}

void tellMeYourName() {
	System.out.println(m_name);
}
void tellMeYourEmail() {
	System.out.println(m_email);
}
void tellMeYourTele() {
	System.out.println(m_tele);
}
}



