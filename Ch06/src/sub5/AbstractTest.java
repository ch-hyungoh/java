package sub5;
/*
 * ��¥ : 2021/05/25
 * ���� : �߻� Ŭ���� �ǽ��ϱ�
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
