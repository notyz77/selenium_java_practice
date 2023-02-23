package test01;

public class Inheritance4 extends Inheritance3 {

	public void mult(int x, int y) {
		z = x * y;
		System.out.println("mul : " + z);
	}

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		Inheritance4 h4 = new Inheritance4();
		h4.addt(x, y);
		h4.subt(25, y);
		h4.mult(x, y);
		
				
	}

}
