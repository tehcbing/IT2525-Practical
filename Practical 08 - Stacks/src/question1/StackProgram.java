package question1;
import java.util.Scanner;
import java.util.Stack;

public class StackProgram {
	public static void main (String[] args) {
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner (System.in);
		String input = "";
		if (stack.empty())
			System.out.println("An empty stack is created");
		
		// loop to push the words in, satisfying the condition "not equals to quit".
		while (!input.equalsIgnoreCase("quit")) {
			System.out.println("Enter a word (enter quit to exit):");
			input = sc.nextLine();
			if (!input.equalsIgnoreCase("quit")) {
			stack.push(input); // pushes the input to the top.
			}
		}
		// Searches for a word in the stack.
		System.out.println("Enter a word to search:");
		String search = sc.nextLine();
		int position = stack.search(search);
		
		System.out.println(search + " is at position " + position + " from the top");
		
		// peek gets the top element
		String top = stack.peek();
		System.out.println("The top element is " + top);
		
		// words in reversed order
		System.out.println("Words in reversed order: ");
		while (!stack.empty()) {
			System.out.println(stack.pop() + " ");
		}
	}
	
	

}
