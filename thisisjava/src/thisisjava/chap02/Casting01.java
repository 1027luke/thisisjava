package thisisjava.chap02;

public class Casting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0x61+1;
		System.out.println(a);

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

		{
			int x=294;
			byte y=(byte) x;
			//System.out.println(x);
			//System.out.println(y);
			System.out.println("test4");
			System.out.println("int:" +x+", B'"+Integer.toBinaryString(x));
			System.out.println("byte:" + y +", B'"+Integer.toBinaryString(y));
			//294가 2진수  0000 0000 0000 0000 0000 0001 0010 0110으로 int x에 저장됨 -> byte 변수는 크기가 8 bit이기 떄문에 int x의 마지막 1byte의 값만 저장함
		}

		{ byte x= -2;
		byte y=2;
		System.out.println("test5");
		System.out.println("byte:" +x+", B'"+Integer.toBinaryString(x));
		System.out.println("byte:"+y+", B'"+Integer.toBinaryString(y));
		// 0000 0010 =양수 2 (byte)
		// 1111 1111 1111 1111 1111 1111 1111 1110=음수2 (int)
		//byte로 음수 2 를 표현할시 마지막 1바이트로만 표현 (1111 1110)
		}
		
		{ byte x= -1;
		byte y=1;
		System.out.println("test6");
		System.out.println("byte:" +x+", B'"+Integer.toBinaryString(x));
		System.out.println("byte:"+y+", B'"+Integer.toBinaryString(y));
	// 1111 1111=-1을 byte로 표현
	// 0000 0001 =1을 byte로 표현
	// +2: 0000 0010
	// +1: 0000 0001
	// 0: 0000 0000
	// -1: 1111 1111 + 0000 0001=  10
	// -2: 1111 1110
		
		}
		
	}
}


