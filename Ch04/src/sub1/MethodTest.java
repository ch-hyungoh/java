/*
 * ��¥ : 2021/05/20
 * ���� : �ڹ� �޼��� �ǽ�
 */

package sub1;

public class MethodTest {
	
	//main method �ڹ� ���α׷� ������
	public static void main(String[] args) {
		
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
		System.out.println(sum(1, 10));
		System.out.println(sum(1, 100));
		System.out.println(sum(1, 1000));

	}
	
	//�ż��� ���� ���ϰ��� Ÿ���� �����ش�
	public static int f(int x) {
		int y = 2 * x +3;
		return y;
	}
	
	public static int sum(int start, int end) {
		
		int sum = 0;
		
		for (int k = start;k<=end;k++) {
			sum +=k;
		}
		
		return sum;
	}
}
