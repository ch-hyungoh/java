package sub2;
/*
 * 
 * 자바 인터페이스 
 */

public class InterfaceTest2 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
		stv.poweron();
		stv.booting();
		stv.internet();
		stv.poweroff();
	}
}
