package sub1;
/*
 * ��¥ : 2021/05/20
 * ���� : �ڹ� ������ �޼��� �ǽ� 
 */

public class MethodScopeTest {
	static int result = 0;
	
	public static void main(String[] args) {
		
		int start = 1;
		int end = 10;
		
		result = sum(start, end);
		
		System.out.println(result);
		
	}
	public static int sum(int s, int e) {
		int sum = 0;
		
		for(int k = s; k <=e; k++) {
			sum += k;
		}
		return sum;
	}
}
