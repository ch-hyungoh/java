package sub3;
//stringmember�ǽ��ϱ�
public class StringMemberTest {
	public static void main(String[] args) {
		String str = "Hello Korea";
		
		//length
		System.out.println("str ���ڿ� ���� : "+str.length());
		
		//charAt -���ڿ� ã��
		System.out.println("str 1��° ���� : "+str.charAt(0));
		System.out.println("str 5��° ���� : "+str.charAt(4));
		
		//substring -���ڿ� �ڸ���
		System.out.println("STR���� 0~5���� ���ڿ� : "+str.substring(0, 5));
		System.out.println("STR���� 6~ ���ڿ� : "+str.substring(6));
		
		//indexOf,lastIndexOf -�ε��� ����
		System.out.println("str���� �տ��� ���� ���� e �ε��� : "+str.indexOf("e"));
		System.out.println("str���� �տ��� ���� ���� e �ε��� : "+str.lastIndexOf("e"));
		
		//replace
		System.out.println("str ���ڿ����� 'korea'�� 'busan'���� ��ü : "+str.replace("Korea", "Busan"));
		System.out.println("str ���ڿ����� 'Hello'�� 'Welcome'���� ��ü : "+str.replace("Hello", "Welcome"));
		
		//valueOf -�⺻Ÿ�Ժ����� ���ڿ��� ����
		int var1 = 1;
		double var2 = 1.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
