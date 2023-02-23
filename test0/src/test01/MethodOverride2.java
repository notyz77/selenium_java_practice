package test01;

public class MethodOverride2 extends MethodOverride1 {
	
	public void eat() {
		System.out.println("You are eating");
	}
	
	public static void main(String[] args) {
		
		MethodOverride2 mr2 = new MethodOverride2();
		mr2.eat();
		
	}
	
}
