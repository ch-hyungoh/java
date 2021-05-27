package sub1;

/*
 * 날짜 : 2021/05/20
 * 내용 : 자바 메서드 타입 실습
 */

public class MethodTypeTest {
	
	public static void main(String[] args) {
		System.out.println(type1(1.1));
		System.out.println(type1(1.2));
		System.out.println(type1(1.3));
		
		type2(true);
		type2(false);
		
		boolean result = type3();
		System.out.println(result);
		
		type4();
	}
	
	//type1 : 매개변수 0 리턴 0
	public static double type1(double x) {
		double y = x +3.14;
		return y;
	}
	
	//type2 : 매개변수 0 리턴 X
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	
	//type3 : 매개변수 X 리턴 0
	public static boolean type3() {
		
		int num1 = 1, num2 = 2;
		
		if(num1 > num2) {
			return false;
		}else {
			return true;
		}
	}
	//type4 : 매개변수 X 리턴 X
	public static void type4() {
		System.out.println(type1(1.1));
	}
	
}
