package Test1;

public class Test19 {
	static int STACK_SIZE = 10;
	static int stack[] = new int[STACK_SIZE];
	static int top = 0;
	
	public static void main(String[] args) {
		push(100);
		push(200);
		push(300);

		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
	
	public static void push(int data) {
		if(top == STACK_SIZE) {
			System.out.println("더이상 데이터를 저장 할 수 없습니다");
		}
		stack[top++] = data;
	}
	public static int pop() {
		if(top == 0) {
			System.out.println("데이터가 없습니다.\n");
			return 0;
		}
		return stack[--top];
	}
}
