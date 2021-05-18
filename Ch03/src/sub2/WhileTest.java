/*날짜 : 2021/05/18
 이름 : 최형오
 내용 : WhileTest
*/

package sub2;

public class WhileTest {

	public static void main(String[] args) {
		int k = 1;
		int sum = 0;
		
		while (k<=10) {
			sum += k;
			k++;
		}
		System.out.println(sum);
		
		int esum = 0;
		int i =1;
		do {
			if (i%2==0) {
				esum += i;
			}
			i++;
		}while(i<=10);
		System.out.println(esum);
		
		int num = 1;
		while(true) {
			num++;
			
			if(num%5 == 0  && num % 7 ==0) {
				break;
			}
		}
		System.out.println(num);
		
		int total =0;
		for(i=1; i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			total +=i;
		}
		System.out.println(total);
	}	
}
