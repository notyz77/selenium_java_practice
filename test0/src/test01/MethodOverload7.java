//this program is example of ambiguous issue.

package test01;

public class MethodOverload7 {
	
	public void sum(int a, long b) {
		
		System.out.println(a + b);
		
	}
	
	public void sum(long a, int b) {
		
		System.out.println(a + b);
		
	}
	
	public static void main(String[] args) {
		
		MethodOverload7 m7 = new MethodOverload7();
		m7.sum(0, 0);
		
	}

}
