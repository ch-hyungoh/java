package sub1;
/*
 * 날짜 : 2021/05/20
 * 내용 : 자바 오버로드 메서드 실습 // 이름이 똑같은 매소드
 */


public class MethodOverloadTest {
	public static void main(String[] args) {
		int r1 = add(1);
		int r2 = add(2, 3);
		String r3 = add("홍길동");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}
	
	public static int add(int num) {
		return num++;
	}
	public static int add(int x, int y) {
		return x+y;
	}
	public static String add(String str) {
		return str+"님 반갑습니다.";
	}
}
