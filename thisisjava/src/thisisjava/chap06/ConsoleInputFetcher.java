package thisisjava.chap06;

import java.util.Scanner;

public final class ConsoleInputFetcher {
	private static Scanner m_scanner= new Scanner(System.in);
	public static int GetPositiveInt() {


		if(m_scanner.hasNextInt()){ 
			return m_scanner.nextInt();
		}
		return -1;

	}
	public static void clearScreen() 
	{ for (int i = 0; i < 80; i++)      
		System.out.println("");  }
}
