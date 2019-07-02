package thisisjava.chap06;
import java.util.Random;

public class BlackJack {
	/*베팅을 한 후 모든 플레이어와 딜러는 두 장의 카드를 받습니다.
	딜러는 자신의 카드 중 한 장을 오픈합니다.
	딜러는 카드의 합이 17이 될 때까지 반드시 추가 카드를 뽑아야 합니다.
	플레이어는 카드의 합이 21을 넘지 않는 범위 내에서 추가 카드를 받을 수도(Hit),받지 않을 수도(Stay)있습니다.*/
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

