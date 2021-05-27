package sub1;
//자바 내장클래스 실습
public class ObjectTest {
	public static void main(String[] args) {
		//object 클래스 자바의 최상위 클래스
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("대만", 5000);
		
		apple.toString();
		banana.toString();
	}
}
