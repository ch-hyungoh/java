package sub1;

/*
 * 날짜 : 2021/05/24
 * 내용 : 클래스 테스트
 */
public class ClassTest {
	public static void main(String[] args) {
		Account kb = new Account("국민은행", "123-1234-1234", "김유신", 10000);
		Account wr = new Account("우리은행", "154-1484-7848", "김춘추", 100000);
		
		kb.deposit(40000);
		kb.withdraw(5000);
		kb.show();
		
		//kb.money++ 캡술화 적용으로 취약코드 예방 
		
		wr.deposit(30000);
		wr.withdraw(2000);
		wr.show();
	}
}
