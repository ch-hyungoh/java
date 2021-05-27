package sub3;

public class Calc {
	
	private static Calc = new Instance();
	public staic Calc getInstance() {
		return Instance;
	}
	private Calc() {}
	public int plus(int x, int y) {return x+y;}
	public int minus(int x, int y) {return x-y;}
	public int multi(int x, int y) {return x*y;}
	public int div(int x, int y) {return x/y;}
}
