package Ch08;

public class p208 {
	public static void main(String[] args) {
		Parent p = new Child();
		
		p.run();
		
		Child c= (Child)p;
		c.eat();
	}
}
