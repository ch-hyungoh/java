
/*��¥ : 2021/05/18
 �̸� : ������
 ���� : IfTest
*/

package sub1;
import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		if(num1<num2) {
			System.out.println("num1�� num2���� �۴�");
		}
		if(num1>0) {
			
			if (num2>1) {
				System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��");
			}
		}
		if(num1>0 &&num2 >1) {
			System.out.println("num1�� 0���� ũ�� num2�� 1���� ũ��");
		}
		
		int var1 = 1;
		int var2 = 2;
		
		if(var1>var2) {
			System.out.println("var1�� var2���� ũ��");
		}else {
			System.out.println("var1�� var2���� �۴�");
		}
		
		int n1=1, n2=2, n3 =3, n4 = 4;
		
		if(n1>n2) {
			System.out.println("n1�� n2���� ũ��.");
		}else if(n2>n3) {
			System.out.println("n2�� n3���� ũ��.");
		}else if(n3>n4) {
			System.out.println("n3�� n4���� ũ��.");
		}else {
			System.out.println("n4�� ���� ũ��.");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� :");
		int score = sc.nextInt();
		
		System.out.print("�Է� ���� : "+score+"\n");
		
		if(score >= 90 && score <= 100) {
			System.out.print("A �Դϴ�.");
		}else if(score >= 80 && score < 90) {
			System.out.print("B �Դϴ�.");
		}else if(score >= 70 && score < 80) {
			System.out.print("C �Դϴ�.");
		}else if(score >= 60 && score < 70) {
			System.out.print("D �Դϴ�.");
		}else{
			System.out.print("F �Դϴ�.");
		}
		
	}
}
