package sub1;

/*
 * 
 * 자바 예외처리 실습
 * 
 */
public class ExceptionTest {
	private void name() {
		int num1 = 1;
		int num2 = 2;
		
		int r1= 0, r2 = 0, r3 = 0, r4 = 0;
		try{
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		System.out.println("프로그램 종료....");
		
	}
}
