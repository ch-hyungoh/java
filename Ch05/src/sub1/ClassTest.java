package sub1;

/*
 * ��¥ : 2021/05/24
 * ���� : Ŭ���� �׽�Ʈ
 */
public class ClassTest {
	public static void main(String[] args) {
		Account kb = new Account("��������", "123-1234-1234", "������", 10000);
		Account wr = new Account("�츮����", "154-1484-7848", "������", 100000);
		
		kb.deposit(40000);
		kb.withdraw(5000);
		kb.show();
		
		//kb.money++ ĸ��ȭ �������� ����ڵ� ���� 
		
		wr.deposit(30000);
		wr.withdraw(2000);
		wr.show();
	}
}
