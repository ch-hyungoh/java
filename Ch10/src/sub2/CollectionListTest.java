package sub2;

import java.util.ArrayList;
import java.util.List;
import sub1.Apple;

public class CollectionListTest {
	public static void main(String[] args) {
		//list ����
		ArrayList<Integer> list1 = new ArrayList<>();

		//list ������ ����
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
		list2.add("������");
		list2.add("������");
		list2.add("�庸��");
		list2.add("������");
		list2.add("�̼���");
		
		for (String person : list2) {
			System.out.print(person + ", ");
		}
		
		
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("�ѱ�", 3000));
		list3.add(new Apple("�߱�", 1000));
		list3.add(new Apple("�Ϻ�", 2000));
		
		//�ѱ���� ���
		Apple apple = list3.get(0);
		apple.toString();
		
		//�Ϻ���� ���
		list3.get(2).toString();
		
		//�߱���� ���
		list3.get(1).toString();
	}
}
