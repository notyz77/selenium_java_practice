package test01;

public class MethodOverload4 extends MethodOverload3{
	
	public static void main(String[] args) {
		
		System.out.println(add(10, 5));
		System.out.println(add(10, 20, 10));
		System.out.println(MethodOverload4.add(10, 5));
		System.out.println(MethodOverload4.add(10, 20, 10));
	}

}
