package thisisjava.chap04;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop
		for(int i=1; i<=10; i++){
			if(i%2!=0){
				continue;
			}
			System.out.println(i);
		}
		for (int i=1; i<=10; i++){
			if (i==5){
				break;
			}
			System.out.println(i);
		}
	}
}



