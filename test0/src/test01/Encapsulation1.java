package test01;

public class Encapsulation1 {
	String name;
    int b;
    final int c = 2;
    
    public void setName(String a) {
            this.name = a;
            this.b = 5;
            System.out.println(b); //5
            System.out.println(c); //2
    }
    
    public Object getName() {
            return name;
    }
}
