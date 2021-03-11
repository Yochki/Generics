package five;

import java.util.Scanner;

public class TestGenericStack2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GenericStack2<String> stack = new GenericStack2<>();
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			stack.push(input.next());
		}
		while (!stack.isEmpty())

			System.out.println(stack.pop() + " ");

	}

}
