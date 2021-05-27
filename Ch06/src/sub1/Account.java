package sub1;

public class Account {
	//속성 : 클래스 멤버변수는 무조건 private 선언으로 캡슐화
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	} // 생성자
	
	public void deposit(int money) {
		this.money += money;
	}
	public void withdraw(int money) {
		this.money -= money;
	}
	public void show() {
		System.out.println("-------------------");
		System.out.println("은행명 : "+this.bank);
		System.out.println("계좌번호 : "+this.id);
		System.out.println("입금주 : "+this.name);
		System.out.println("현재금액 : "+this.money);
		System.out.println("-------------------");
	}
	
}
