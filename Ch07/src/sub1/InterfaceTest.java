package sub1;
/*
 * 
 * �ڹ� �������̽�
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		RemoteControl lg = new RemoteLG();
		RemoteControl samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chDown();
		samsung.powerOff();
		
	}
}
