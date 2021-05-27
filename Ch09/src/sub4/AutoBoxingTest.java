package sub4;
/*
 * 
 * auto-boxing test
 */
public class AutoBoxingTest {
	public static void main(String[] args) {
		//auto-boxing(기본타입 -> wrapping)
		
		Integer w1 = 1;
		Double w2 = 2.13;
		Boolean w3 = true;
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		
		//auto-boxing(wrapping -> 기본타입)
		int var1 = w1;
		double var2 = w2;
		boolean var3 = w3;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}
