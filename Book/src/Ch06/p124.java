package Ch06;

public class p124 {
	public static void main(String[] args) {
		int[] arrInt = {1, 2, 3};
		
		int [] arrInt2 = new int[5];
		
		for (int i= 0; i<arrInt.length; i++) {
			arrInt2[i] = arrInt[i];
		}
		
		for (int i = 0; i<arrInt.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
}
