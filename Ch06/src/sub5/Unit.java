package sub5;

//추상 클래스 : 1개이상 추상메서드를 갖는 클래스, 객체 생성 불가, 상속 클래스
public abstract class Unit {

	public void move() {
		System.out.println("Unit move...");
	}
	
	// 추상메서드
	public abstract void attack();
	
}
