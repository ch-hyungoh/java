import java.util.Scanner;

/*날짜 : 2021/05/17
 이름 : 최형오
 내용 : 4.if문
*/
public class IfTest {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		if(num1<num2) {
			System.out.println("num1은 num2보다 작다");
		}
		if(num1>0) {
			
			if (num2>1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다");
			}
		}
		if(num1>0 &&num2 >1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다");
		}
		
		int var1 = 1;
		int var2 = 2;
		
		if(var1>var2) {
			System.out.println("var1은 var2보다 크다");
		}else {
			System.out.println("var1은 var2보다 작다");
		}
		
		int n1=1, n2=2, n3 =3, n4 = 4;
		
		if(n1>n2) {
			System.out.println("n1이 n2보다 크다.");
		}else if(n2>n3) {
			System.out.println("n2이 n3보다 크다.");
		}else if(n3>n4) {
			System.out.println("n3이 n4보다 크다.");
		}else {
			System.out.println("n4가 가장 크다.");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		int score = sc.nextInt();
		
		System.out.print("입력 점수 : "+score+"\n");
		
		if(score >= 90 && score <= 100) {
			System.out.print("A 입니다.");
		}else if(score >= 80 && score < 90) {
			System.out.print("B 입니다.");
		}else if(score >= 70 && score < 80) {
			System.out.print("C 입니다.");
		}else if(score >= 60 && score < 70) {
			System.out.print("D 입니다.");
		}else{
			System.out.print("F 입니다.");
		}
		
	}
}
