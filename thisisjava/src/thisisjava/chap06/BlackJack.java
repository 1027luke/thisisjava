package thisisjava.chap06;
import java.util.Random;

public class BlackJack {
	/*������ �� �� ��� �÷��̾�� ������ �� ���� ī�带 �޽��ϴ�.
	������ �ڽ��� ī�� �� �� ���� �����մϴ�.
	������ ī���� ���� 17�� �� ������ �ݵ�� �߰� ī�带 �̾ƾ� �մϴ�.
	�÷��̾�� ī���� ���� 21�� ���� �ʴ� ���� ������ �߰� ī�带 ���� ����(Hit),���� ���� ����(Stay)�ֽ��ϴ�.*/
	int DrawCard(){
		Random player = new Random();
		Random dealer = new Random();
		int player_hand =player.nextInt(12)+1;
		int dealer_hand =dealer.nextInt(12)+1;
		System.out.println("Player's Hand:"+ player_hand);
		System.out.println("Dealer's Hand:"+ dealer_hand);
		while (player_hand<21){
			System.out.println("Would you like to draw more? 1.Yes 2. No");
			int draw=0;
			draw=ConsoleInputFetcher.GetPositiveInt();
			if (draw==1){
				int player_hand2=player.nextInt(12)+1;
				System.out.println("2nd Hand:"+player_hand2);
				player_hand=player_hand+player_hand2;
				System.out.println("Player's Final Result:"+player_hand);

			}
			else if (draw==2){
				break;
			}
		}
		while (dealer_hand<17)
		{
			int dealer_hand2=dealer.nextInt(12)+1;
			dealer_hand=dealer_hand+dealer_hand2;
			System.out.println("Dealer's final Result:"+dealer_hand);
		}

		if (player_hand>dealer_hand&&player_hand<=21){
			return 1;
		}
		else if (player_hand==dealer_hand){
			return 2;
		}
		else if (player_hand<dealer_hand||player_hand>21){
			return 3;
		}
		return 1;
	}
}

