package thisisjava.chap02;

public class Casting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** INT -> SHORT */
		{
			int x = 0x123456;
			short y = (short) x;	
			System.out.println("test1");
			System.out.println("int:"   + x + ", B'" + Integer.toBinaryString(x));
			System.out.println("short:" + y + ", B'" + Integer.toBinaryString(y));
		}
		
		/** INT -> BYTE */
		{
			int x = 0x123456;
			byte y = (byte) x;
			System.out.println("test2");
			System.out.println("int:"   + x + ", B'" + Integer.toBinaryString(x));
			System.out.println("byte:"  + y + ", B'" + Integer.toBinaryString(y));
		}
		
		/** SHORT -> BYTE */
		{
			short x = 0x1234;
			byte y = (byte) x;	
			System.out.println("test3");
			System.out.println("int:"   + x + ", B'" + Integer.toBinaryString(x));
			System.out.println("byte:"  + y + ", B'" + Integer.toBinaryString(y));
		}
		
	}

}
