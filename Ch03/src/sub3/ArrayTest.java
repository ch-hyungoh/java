/*��¥ : 2021/05/18
 �̸� : ������
 ���� : �迭 Test
*/
package sub3;

public class ArrayTest {
	public static void main(String[] args) {
		int nums[] = {1, 2, 3,4, 5};
		
		System.out.println("�迭 ����"+nums.length);
		
		System.out.println("ù���� ����"+nums[0]);
		System.out.println("2���� ����"+nums[1]);
		System.out.println("3���� ����"+nums[2]);
		
		for(int num : nums) {
			System.out.println("�迭 ���� :"+num);
		}
		
		String people[] = {"������", "������", "�庸��", "������", "�̼���"};
		
		for(String person : people) {
			System.out.println("people ���� : "+person);
		}
	}
}
