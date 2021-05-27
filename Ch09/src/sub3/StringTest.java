package sub3;

public class StringTest {
	public static void main(String[] args) {
		
		//문자열  = 문자+배열
		String str = "Hello";
		char[] arr = {'H', 'e', 'l', 'l', 'o'};
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		
		if(str1 == str2) {
			System.out.println("참조값이 같다");
		}else{
			System.out.println("참조값이 다르다");
		}
		
		if(str3 == str4) {
			System.out.println("참조값이 같다");
		}else{
			System.out.println("참조값이 다르다");
		}
		
		if(str1 .equals(str4)) {
			System.out.println("문자열값이 같다");
		}else {
			System.out.println("문자열값이 같다");
		}
	}
}
