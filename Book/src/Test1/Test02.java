package Test1;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("input °ª ÀÔ·Â :");
		
		input = sc.nextInt();
		int result = (1+2) * input;
		
		System.out.println("(1+2) *input = "+result);
		
		String name;
		System.out.print("name °ª ÀÔ·Â :");
		
		name = sc.next();
		String hello = "¾È³ç! "+name+"´Ô ¹Ý°©½À´Ï´Ù.";
		System.out.println(hello);
	}
}
