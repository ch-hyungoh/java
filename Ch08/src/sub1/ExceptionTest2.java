package sub1;

public class ExceptionTest2 {
	public static void main(String[] args) {
		//배열 인덱스 참조에러
		
		
		int arr[] = new int[3];
		
		for (int i = 0; i<=3; i++) {
			try {
				arr[i] = i+1;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		
		//Null pointer에러
		
		Tiger tiger = null;
		try {
		tiger.move();
		tiger.hunt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//casting
		try {
		Animal a1 = new Eagle();
		Animal a2 = new Shark();
		
		Eagle eagle = (Eagle)a1;
		Shark shark = (Shark)a2;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료....");
	}
}
