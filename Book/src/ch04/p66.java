package ch04;

public class p66 {
	public static void main(String[] args) {
		System.out.println("2:"+Integer.toBinaryString(2));
		System.out.println("3:"+Integer.toBinaryString(3));
		
		System.out.println("2&3 :"+(2&3));
		System.out.println("2|3 :"+(2|3));
		System.out.println("2^3 :"+(2^3));
		System.out.println("~3 :"+~3);
		
		System.out.println("~3�� �������� :"+Integer.toBinaryString(~3));
		System.out.println(Integer.toBinaryString(~3).length());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.parseInt("11111111111111111100",2)-Integer.MAX_VALUE-1);
		
	
	}
}