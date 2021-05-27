package sub1;
/*
 * 날짜 : 2021/05/24
 * 내용 : 자바 클래스 상속 실습하기
 */
public class InheritanceTest {
	public static void main(String[] args) {
		StockAccount kb = new StockAccount("국민은행", "123-1234-1234", "김유신", 10000, "삼성전자", 10, 80000);
		kb.show();
	}
}
