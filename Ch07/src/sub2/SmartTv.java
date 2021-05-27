package sub2;

public class SmartTv extends Tv implements Computer {
	
	@Override
	public void booting() {
		System.out.println("Smart tv booting");
		
	}
	
	@Override
	public void internet() {
		System.out.println("Smart tv internet");
		
	}
}
