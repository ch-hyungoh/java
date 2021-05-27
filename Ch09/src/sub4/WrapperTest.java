package sub4;
/*
 * 
 * wrapper Ŭ���� �׽�Ʈ
 */
public class WrapperTest {
	public static void main(String[] args) {
		
		//�⺻ Ÿ��(primitive)
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		char var4 = 'A';
		
		//Wrapper class�� ����
		Integer w1 = var1;
		Double w2 = var2;
		Boolean w3 = var3;
		Character w4 = var4;
		
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		System.out.println(w4);
		
		//Wrapper Ȱ�� : ���ڿ� -> �⺻Ÿ�� ��ȯ
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "true";
		
		int 	val1 = Integer.parseInt(str1);
		double 	val2 = Double.parseDouble(str2);
		boolean val3 = Boolean.parseBoolean(str3);
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		//Wrapper Ȱ�� : ���ڿ� -> Wrapper ��ȯ
		Integer wr1 = Integer.valueOf(val1);
		Double wr2 = Double.valueOf(val2);
		Boolean wr3 = Boolean.valueOf(val3);
		
		System.out.println(wr1);
		System.out.println(wr2);
		System.out.println(wr3);
		
		//Wrapper Ȱ�� : wrapper -> ���ڿ� ��ȯ
		String s1 = wr1.toString();
		String s2 = wr2.toString();
		String s3 = wr3.toString();
		
	}
}
