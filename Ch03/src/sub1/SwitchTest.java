/*��¥ : 2021/05/18
 �̸� : ������
 ���� : SwitchTest
*/
package sub1;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		String animal = "shark";
		
		switch(animal) {
		case "lion":
			System.out.println("animal�� Lion�Դϴ�");
			break;
		case "eagle":
			System.out.println("animal�� eagle�Դϴ�");
			break;
		case "tiger":
			System.out.println("animal�� tiger�Դϴ�");
			break;
		default:
			System.out.println("animal�� lion,eagle,tiger�� �ƴմϴ�");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� :");
		int score = sc.nextInt();
		System.out.println("�Է� ����: "+score);
		
		switch (score/10) {
		case 10:
			System.out.print("A �Դϴ�.");
			break;
		case 9:
			System.out.print("A �Դϴ�.");
			break;
		case 8:
			System.out.print("B �Դϴ�.");
		break;
		case 7:
			System.out.print("C �Դϴ�.");
			break;
		case 6:
			System.out.print("D �Դϴ�.");
			break;
		default:
			System.out.print("F �Դϴ�.");
			break;
		}
	}
}
