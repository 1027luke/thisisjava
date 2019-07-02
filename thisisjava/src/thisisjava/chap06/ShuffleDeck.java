package thisisjava.chap06;
import java.util.*;

public class ShuffleDeck {

	public static int shuffleDeck (int[] deck, int theNumber)
	{
		int [] array1 = new int [52];

		Random random = new Random();
		for (int i = deck.length, j, tmp; i > 1; i--) {
			j = random.nextInt(i);

			tmp = deck[i - 1];
			deck[i - 1] = deck[j];
			deck[j] = tmp;
			return theNumber;
		}

		return 0;
	}

	public static void main(String[] args)
	{
		int [] deck = new int [52];
		for(int i=0; i<52; i++)
		{
			deck[i]=i+1;
			System.out.println(i+": " +deck[i]);
		} 
		
		int count;
		count=1;
		int total=1;
		shuffleDeck(deck, count);
		for(int i=0; i<52; i++){
			System.out.println(i+": " +deck[i]);
		}
	}
}
