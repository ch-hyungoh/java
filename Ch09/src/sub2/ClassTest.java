package sub2;

import sub1.Apple;

// �ڹ� ����Ŭ���� �ǽ��ϱ�
public class ClassTest {
	public static void main(String[] args) {
	
		Apple a1 = new Apple("�ѱ�", 3000);
		a1.toString();
		
		try {
		Class cls = Class.forName("sub1.Apple");
			Apple a2 = (Apple)cls.newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
