package thisisjava.chap06;
import java.util.Random;

public class HumanGamble {

	Random rand = new Random();
	//1.nextint�Ἥ 3���� ����� ���� �������� ������ �ϱ�
	int RockPaperScissors(){
		//2.3���� ����� ���� ����, ����, ��  assign �����κ��� input�ޱ�
		// �������� int�� �����ϱ�
		// ������ imput�� ����input���� ���� �̰���� �����ϱ�
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
