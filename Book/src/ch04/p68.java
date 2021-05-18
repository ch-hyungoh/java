package ch04;

public class p68 {
	public static void main(String[] args) {
		System.out.println(3<<2);
		System.out.println("8의 이진수 :"+Integer.toBinaryString(3));
		System.out.println("12의 이진수 :"+Integer.toBinaryString(12));
		
		System.out.println(8 >> 2);
		System.out.println("8의 이진수 :"+Integer.toBinaryString(3));
		System.out.println("12의 이진수 :"+Integer.toBinaryString(12));

		System.out.println(-8 >> 2);
		System.out.println("-8의 이진수 :"+Integer.toBinaryString(-3));
		System.out.println("-8>>>3 :"+Integer.toBinaryString(-8>>>3));

	}
}
