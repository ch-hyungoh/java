package sub3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * �ڹ� �÷��� ���� �ǽ�
 */

public class CollectionSetTest {
	public static void main(String[] args) {
		//set ����
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(4);
		
		System.out.println("������ ���� : "+set.size());
		
		//set ���� ���
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next()+", ");
		}
			
	}
}
