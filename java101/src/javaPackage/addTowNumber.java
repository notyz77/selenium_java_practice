package javaPackage;

public class addTowNumber {
	public void num1(int a, int b) {
		int sum,sub,mub;
		
		sum=a+b;
		sub=a-b;
		mub=a*b;
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mub);
		
	}
	public static void main(String[] args) {
		
		addTowNumber o1 = new addTowNumber();
		o1.num1(2, 2);
		
	}
}
