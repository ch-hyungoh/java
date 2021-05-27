package sub5;
/*
 * 
 * math test
 */
public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(3.14));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.ceil(1.2));
		System.out.println(Math.ceil(1.8));
		System.out.println(Math.floor(1.2));
		System.out.println(Math.floor(1.8));
		System.out.println(Math.round(1.2));
		System.out.println(Math.round(1.8));
		
		//random
		double num1 = Math.random();
		System.out.println(num1);
		
		double num2 = num1*10;
		System.out.println(num2);
		
		double num3 = Math.ceil(num2);
		System.out.println(num3);
		
		double num = Math.ceil(Math.random() *45);
		System.out.println(num);
	}
}
