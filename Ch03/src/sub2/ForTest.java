/*날짜 : 2021/05/18
 이름 : 최형오
 내용 : ForTest
*/
package sub2;

public class ForTest {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i<=3 ; i++) {
			System.out.println("Hello java!");
		}
		for(int k = 1; k<=10; k++) {
			sum += k;
		}
		System.out.println(sum);
		sum = 0;
		for(int k = 1; k<=10; k++) {
			if (k%2 ==0) {
				sum += k;
			}
		}
		System.out.println(sum);
		
		for(int x = 2; x < 10;x++) {
			System.out.println(x+"단 시작");
			for (int y = 1; y<9;y++) {
				System.out.println(x+" * "+y+" = "+x*y);
			}
		}
		
		for(int start = 1; start <=10; start++) {
			for(int end = 1; end <= start; end++) {
				System.out.print("☆");
			}
			System.out.println("\n");
		}
	}
}
