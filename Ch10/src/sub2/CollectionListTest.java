package sub2;

import java.util.ArrayList;
import java.util.List;
import sub1.Apple;

public class CollectionListTest {
	public static void main(String[] args) {
		//list 생성
		ArrayList<Integer> list1 = new ArrayList<>();

		//list 데이터 저장
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(1, 3);
		
		for (int num : list1) {
			System.out.print(num + ", ");
		}
		System.out.println("\n");
		
		List<String> list2 = new ArrayList<>();
		list2.add("김유신");
		list2.add("김춘추");
		list2.add("장보고");
		list2.add("강감찬");
		list2.add("이순신");
		
		for (String person : list2) {
			System.out.print(person + ", ");
		}
		
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("한국", 3000));
		list3.add(new Apple("중국", 1000));
		list3.add(new Apple("일본", 2000));
		
		//한국사과 출력
		Apple apple = list3.get(0);
		apple.toString();
		
		//일본사과 출력
		list3.get(2).toString();
		
		//중국사과 출력
		list3.get(1).toString();
	}
}
