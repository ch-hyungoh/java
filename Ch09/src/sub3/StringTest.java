package sub3;

public class StringTest {
	public static void main(String[] args) {
		
		//���ڿ�  = ����+�迭
		String str = "Hello";
		char[] arr = {'H', 'e', 'l', 'l', 'o'};
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		
		if(str1 == str2) {
			System.out.println("�������� ����");
		}else{
			System.out.println("�������� �ٸ���");
		}
		
		if(str3 == str4) {
			System.out.println("�������� ����");
		}else{
			System.out.println("�������� �ٸ���");
		}
		
		if(str1 .equals(str4)) {
			System.out.println("���ڿ����� ����");
		}else {
			System.out.println("���ڿ����� ����");
		}
	}
}
