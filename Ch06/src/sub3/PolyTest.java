package sub3;
/*
 * 날짜 : 2021/05/25
 * 내용 : 폴리 테스트 실습하기
 * 다형성 : 상속관계에 있는 부모클래스의 구체적인 기능을 자식 클래스 다시 정의하는 기능
 * 부모 클래스 타입으로 객체를 선언
 */
public class PolyTest {

	public static void main(String[] args) {
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
		
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		//다형성을 활용한 객체 배열
		Tiger obj1 = new Tiger();
		Eagle obj2 = new Eagle();
		Shark obj3 = new Shark();
		
		Animal objects[] = {obj1, obj2, obj3};
		
		for(Animal obj : objects) {
			obj.move();
			obj.hunt();
		}
	}
}
