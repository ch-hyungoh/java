package sub3;
//∞¥√º∞£ ∞·«’
public class InterfaceTest3 {
	public static void main(String[] args) {
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchon();
		socket.switchoff();
		
	}
}
	