package sub3;

/*
 * ��¥ : 2021/05/24
 * ���� : ��������(Ŭ���� ����), �����޼ҵ�Ŭ���� �׽�Ʈ
 */
public class StaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//���������� �ϳ��� �ν��Ͻ��� �����Ǿ� ������
		//���������� ���� �Ҵ翵�� �޼ҵ忡 �����Ǿ��� ������ ��ü ���� ���� �ٷ� ���� ����
	
		Increment.num2 += 3;
		Increment.add();
		
		Calc c = Calc.getInstance();
		int r1 = c.plus(1, 2);
		int r2 = c.minus(1, 2);
		int r3 = c.multi(2, 3);
		int r4 = c.div(2, 3);
		
		System.out.println("r1 :"+r1);
		System.out.println("r2 :"+r2);
		System.out.println("r3 :"+r3);
		System.out.println("r4 :"+r4);
	}
}
