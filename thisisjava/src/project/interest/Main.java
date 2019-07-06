package project.interest;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Initial balance, Interest rate, Final Balance 입력 받음
		몇개월이 지나야 final balance보다 크거나 같아지는지 개월수를 구해라
		Final Balance=Initial Balance*Interest Rate*Time+Initial Balance
		*/
		double initialBalance= 100;
		double interestRate= 0.1;
		double finalBalance=130;
		int time=0;
		double result= initialBalance;
		while(result<finalBalance){
		result= Method1.getInterest(result,interestRate,finalBalance);
		time+=1;
		}
		System.out.println("Initial balance: "+initialBalance);
		System.out.println("Interest rate: "+interestRate);
		System.out.println(":Target balance: "+finalBalance);
		System.out.println("It took "+time+" months to achieve targetted balance");
		/*result=Method1.getInterest(result, 0.1, 110);
		System.out.println(result);
		result=Method1.getInterest(result, 0.1, 110);
		System.out.println(result);*/
	}

}
