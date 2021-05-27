package sub2;

import sub1.Apple;

// 자바 내장클래스 실습하기
public class ClassTest {
	public static void main(String[] args) {
	
		Apple a1 = new Apple("한국", 3000);
		a1.toString();
		
		try {
		Class cls = Class.forName("sub1.Apple");
			Apple a2 = (Apple)cls.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
