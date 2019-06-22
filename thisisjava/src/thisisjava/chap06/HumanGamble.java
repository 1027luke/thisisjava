package thisisjava.chap06;
import java.util.Random;

public class HumanGamble {

	Random rand = new Random();
	//1.nextint써서 3가지 경우의 수가 랜덤으로 나오게 하기
	int RockPaperScissors(){
		//2.3가지 경우의 수에 가위, 바위, 보  assign
		int rand_int1 = rand.nextInt(3); 
		if(rand_int1==0){
			System.out.println("Rock");
		}
		else if(rand_int1==1){
			System.out.println("Scissors");
		}
		else if(rand_int1==2){
				System.out.println("Papaer");
			}
		return rand_int1;
	}
	//3.

}
