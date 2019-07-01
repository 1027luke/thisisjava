package thisisjava.chap06;
import java.util.Random;

public class HumanGamble {

	Random rand = new Random();
	//1.nextint써서 3가지 경우의 수가 랜덤으로 나오게 하기
	int RockPaperScissors(){
		//2.3가지 경우의 수에 가위, 바위, 보  assign 유저로부터 input받기
		// 랜덤으로 int값 생성하기
		// 우저의 imput과 랜덤input비교후 누가 이겼는지 생성하기
		System.out.println("Choose your option 1.Rock 2.Paper 3.Scissors");
		int usersPick=0;
		usersPick=ConsoleInputFetcher.GetPositiveInt();
		if (usersPick==1){
			System.out.println("Your choice: Rock");
		}
		else if (usersPick==2){
			System.out.println("Your choice: Paper");
		}
		else if (usersPick==3){
			System.out.println("Your choice: Scissors");
		}
		int rand_int1 = rand.nextInt(3)+1; 
		if(rand_int1==1){
			System.out.println("Opponent's choice: Rock");
		}
		else if(rand_int1==2){
			System.out.println("Opponent's choice: Paper");
		}
		else if(rand_int1==3){
			System.out.println("Opponent's choice: Scissors");
		}
		if (usersPick==rand_int1){
			return 2;
		}
		if (usersPick==1&&rand_int1==3){
			return 1;
		}
		else if (usersPick==2&&rand_int1==1){
			return 1;
		}
		else if (usersPick==3&&rand_int1==2){
			return 1;
		}
		return 3;
	}

	//3.

}
