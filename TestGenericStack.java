package five;

import java.util.Scanner;

public class TestGenericStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericStack<String> stack1 = new GenericStack<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Input five strings");
		for (int i = 0; i < 5; i++) {
			stack1.push(s.nextLine());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());
		}

	}

}
