package question2;

import java.util.Scanner;
import java.util.Stack;

public class StackString {
	public static void main (String[] args) {
		Stack <Object> stack = new Stack<Object>();
		Scanner sc = new Scanner (System.in);
		String input = "";
		String nInput = "";
		
		System.out.println("Enter a string input: ");
		input = sc.nextLine();
		
		// loop for checking through all characters of the string input
		for (int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		
		while (!stack.isEmpty()) {
			String n = stack.pop().toString();
			nInput+= n;
			
		}
		
		System.out.println(nInput);
	}
	
	

}
