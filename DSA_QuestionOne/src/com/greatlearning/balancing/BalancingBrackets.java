package com.greatlearning.balancing;

import java.util.Stack;

public class BalancingBrackets {
	
	private static boolean isBalancedStringExp(String input) {
		
		Stack<Character> data = new Stack<Character>();
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			if(ch=='(' || ch=='[' || ch=='{') {
				data.push(ch);
				continue;
			}
			// we are encountering close braces and stack is empty
			if(data.isEmpty()) {
				return false;
			}
			
			char matchCh = data.pop();
			
			switch(ch) {
			case ')':
				if(matchCh != '(') {
					return false;
				}
				break;
			case ']':
				if(matchCh != '[') {
					return false;
				}
				break;
			case '}':
				if(matchCh != '{') {
					return false;
				}
				break;
			
			}
		}
		return data.isEmpty();
	}
	
	// main method to pass inputs and print result
	
	public static void main(String [] args) {
		String input ="([[{}]])";
		
		boolean result = isBalancedStringExp(input);
		
		if(result) {
			System.out.println("The entered string has Balanced Brackets");
		}else {
			System.out.println("The entered string do not contain Balanced Brackets");
		}
	}

}
