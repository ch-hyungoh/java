package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * 자바 컬렉션 집합 실습
 */

public class CollectionSetTest {
	public static void main(String[] args) {
		//set 생성
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(4);
		
		System.out.println("데이터 갯수 : "+set.size());
		
		//set 원소 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next()+", ");
		}
			
	}
}
