package sub5;
/*
 * 날짜 : 2021/05/25
 * 내용 : 추상 클래스 실습하기
 * 
 */
public class AbstractTest {

	public static void main(String[] args) {
		
		//Unit unit = new Unit();
		Unit marin    = new Marin();
		Unit zealot   = new Zealot();
		Unit Zugling = new Zugling();
				
		marin.move();
		zealot.move();
		Zugling.move();
		
		marin.attack();
		zealot.attack();
		Zugling.attack();
	}
}
