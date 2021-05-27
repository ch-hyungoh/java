package Ch06;

public class p113 {
	public static void main(String[] args) {
		int number[] = new int[100];
		
		for(int i =0; i<number.length; i++) {
			number[i] = i+1;
		}
		for (int k = 0; k<number.length; k++) {
			System.out.println(number[k]);
		}
	}
}
