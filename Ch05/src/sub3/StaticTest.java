package sub3;

/*
 * 날짜 : 2021/05/24
 * 내용 : 정적변수(클래스 변수), 정적메소드클래스 테스트
 */
public class StaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//정젹변수는 하나의 인스턴스로 관리되어 참조됨
		//정적변수는 고정 할당영역 메소드에 생성되었기 때문에 객체 생성 없이 바로 참조 가능
	
		Increment.num2 += 3;
		Increment.add();
		
		Calc c = Calc.getInstance();
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		int r4 = c.div(2, 3);
		
		System.out.println("r1 :"+r1);
		System.out.println("r2 :"+r2);
		System.out.println("r3 :"+r3);
		System.out.println("r4 :"+r4);
	}
}
