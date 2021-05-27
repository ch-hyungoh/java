package sub1;

public class StockAccount extends Account {
	
	private String stock;
	private int amount;
	private int price;
	
	
	public StockAccount(String bank, String id, String name, int money, String stock, int amount, int price) {
		super(bank, id, name, money); //������
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void sell(int amount, int price) {
		int total = amount * price;
		money += total;
	}
	public void buy(int amount, int price) {
		int total = amount * price;
		money -= total;
	}
	public void show() {
		System.out.println("----------------------");
		System.out.println("����� : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�ӱ��� : "+name);
		System.out.println("�����ܾ� : "+money);
		System.out.println("�ֽ����� : "+stock);
		System.out.println("�ֽļ���: "+amount);
		System.out.println("�ֽİ���: "+price);
		System.out.println("---------------------");
	}
	
}