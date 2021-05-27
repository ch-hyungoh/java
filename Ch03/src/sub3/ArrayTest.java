/*날짜 : 2021/05/18
 이름 : 최형오
 내용 : 배열 Test
*/
package sub3;

public class ArrayTest {
	public static void main(String[] args) {
		int nums[] = {1, 2, 3,4, 5};
		
		System.out.println("배열 갯수"+nums.length);
		
		System.out.println("첫번재 원소"+nums[0]);
		System.out.println("2번재 원소"+nums[1]);
		System.out.println("3번재 원소"+nums[2]);
		
		for(int num : nums) {
			System.out.println("배열 원소 :"+num);
		}
		
		String people[] = {"김유신", "김춘추", "장보고", "강감찬", "이순신"};
		
		for(String person : people) {
			System.out.println("people 원소 : "+person);
		}
	}
}
