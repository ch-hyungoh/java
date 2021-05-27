package sub3;

public class Calc {
	private Calc instance = new Calc();
	
	public Calc getInstance() {
		return instance;
	}
	
	private Calc() {}
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
	}
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) throws Exception {
		if( y == 0) {
			Exception e1 = new Exception("y는 0이 되면 안된다.");
			throw e1;
		}else if(y < 0) {
			Exception e2 = new Exception("y는 양수이어야 한다.");
			throw e2;
		}
		return x/y;
	}
}
