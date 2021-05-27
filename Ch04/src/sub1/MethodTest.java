/*
 * 날짜 : 2021/05/20
 * 내용 : 자바 메서드 실습
 */

package sub1;

public class MethodTest {
	
	//main method 자바 프로그램 시작점
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
	
	//매서드 정의 리턴값의 타입을 맞춰준다
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
