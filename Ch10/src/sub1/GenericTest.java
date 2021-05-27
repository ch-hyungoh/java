package sub1;
/*
 * 자바 제네릭 클래스 실습
 */
public class GenericTest {
	public static void main(String[] args) {
		Apple apple = new Apple("한국", 20000);
		Banana banana = new Banana("대만", 3000);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setFruit(banana);
		
		box1.getFruit().toString();
		box2.getFruit().toString();
	}
}
