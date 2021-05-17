package sub3;

/*
 * 날짜 : 2021/05/17
 * 내용 : 자바 변수 실습하기
 * 
 */

public class OperatorTest {
	public static void main(String[] args) {
		// 산술 연산자
		int num1 = 1, num2 = 2, num3 = 3, num4 = 4; 
		int rs1 = num1 + num2;
		int rs2 = num1 - num2;
		int rs3 = num2 * num3;
		int rs4 = num4 / num2;
		int rs5 = num4 % num3;
		
		System.out.println("rs1 :"+rs1);
		System.out.println("rs2 :"+rs2);
		System.out.println("rs3 :"+rs3);
		System.out.println("rs4 :"+rs4);
		System.out.println("rs5 :"+rs5);
		// 증감, 감소 연산자
		int n1 = 1;
		int n2 = 2;
		
		n1++;
		++n1;
		
		n2--;
		--n2;
		
		System.out.println("n1 :"+n1);
		System.out.println("n2 :"+n2);
		// 복합대입 연산자
		int var1 = 1;
		int var2 = 2;
		int var3 = 3;
		int var4 = 4;
		
		var1 += 1;
		var2 -= 2;
		var3 *= 3;
		var4 /= 4;
		
		System.out.println("var1 :"+var1);
		System.out.println("var2 :"+var2);
		System.out.println("var3 :"+var3);
		System.out.println("var4 :"+var4);
		
		// 비교 연산자
		int val1 = 1, val2 = 2;
		boolean res1 = val1 > val2;
		boolean res2 = val1 < val2;
		boolean res3 = val1 >= val2;
		boolean res4 = val1 <= val2;
		boolean res5 = val1 == val2;
		boolean res6 = val1 != val2;
		
		System.out.println("res1 :"+res1);
		System.out.println("res2 :"+res2);
		System.out.println("res3 :"+res3);
		System.out.println("res4 :"+res4);
		System.out.println("res5 :"+res5);
		System.out.println("res6 :"+res6);
		
		// 논리 연산자
		
		boolean result1 = (val1 > 1) && (val2 <3);
		boolean result2 = (val1 > 0) && (val2 <3);
		boolean result3 = (val1 > 1) || (val2 <3);
		boolean result4 = (val1 > 1) || (val2 <3);
		boolean result5 = !(val1 > val2);
		
		System.out.println("result1 :"+result1);
		System.out.println("result2 :"+result2);
		System.out.println("result3 :"+result3);
		System.out.println("result4 :"+result4);
		System.out.println("result5 :"+result5);
		
	}
}
