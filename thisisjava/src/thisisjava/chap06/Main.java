package thisisjava.chap06;

public class Main {
	
	//1. member variable - class variable

	
	//2. method - class function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human1 = new Human(22, "Man", "Daeho");		
		
		human1.tellMeYourAge();
		human1.tellMeYourSex();
		human1.tellMeYourName();
		
		
		for(int i=0; i<10; i++){
			human1.tellMeYourHP();
			human1.tellMeYourInt();
			human1.study();
		}		

	}

}
