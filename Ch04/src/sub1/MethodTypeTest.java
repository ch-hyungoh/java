package sub1;

/*
 * ��¥ : 2021/05/20
 * ���� : �ڹ� �޼��� Ÿ�� �ǽ�
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
	
	//type1 : �Ű����� 0 ���� 0
	public static double type1(double x) {
		double y = x +3.14;
		return y;
	}
	
	//type2 : �Ű����� 0 ���� X
	public static void type2(boolean status) {
		if(status) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
	}
	
	//type3 : �Ű����� X ���� 0
	public static boolean type3() {
		
		int num1 = 1, num2 = 2;
		
		if(num1 > num2) {
			return false;
		}else {
			return true;
		}
	}
	//type4 : �Ű����� X ���� X
	public static void type4() {
		System.out.println(type1(1.1));
	}
	
}
