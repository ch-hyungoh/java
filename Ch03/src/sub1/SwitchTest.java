/*날짜 : 2021/05/18
 이름 : 최형오
 내용 : SwitchTest
*/
package sub1;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		String animal = "shark";
		
		switch(animal) {
		case "lion":
			System.out.println("animal은 Lion입니다");
			break;
		case "eagle":
			System.out.println("animal은 eagle입니다");
			break;
		case "tiger":
			System.out.println("animal은 tiger입니다");
			break;
		default:
			System.out.println("animal은 lion,eagle,tiger가 아닙니다");
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 :");
		int score = sc.nextInt();
		System.out.println("입력 점수: "+score);
		
		switch (score/10) {
		case 10:
			System.out.print("A 입니다.");
			break;
		case 9:
			System.out.print("A 입니다.");
			break;
		case 8:
			System.out.print("B 입니다.");
		break;
		case 7:
			System.out.print("C 입니다.");
			break;
		case 6:
			System.out.print("D 입니다.");
			break;
		default:
			System.out.print("F 입니다.");
			break;
		}
	}
}
