package thisisjava.chap05;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 0;
		String s="b";
		System.out.println(x);
		addint(x);
		System.out.println(x);
		
		System.out.println(s);
		addString(s);
		System.out.println(s);
	}

	public static void addint(int a){
		a=a+1;
	}
	public static void addString(String s){
		s= s+"a";
	}
}
