//this program is example of solving ambiguous issue.

package test01;

public class MethodOverload8 {
	
	public void sum(int a, int b) {
		
		System.out.println(a + b);
		
	}
	
	public void sum(long a, long b) {
		
		System.out.println(a + b);
		
	}
	
	public static void main(String[] args) {
		
		MethodOverload8 m7 = new MethodOverload8();
		m7.sum(1, 4);
		
	}

}

