package com.ds.stack.reverse.string;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Given a string";
		System.out.println(reverseString(str));

	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		char [] chars = str.toCharArray();
		for(char c : chars){
			stack.push(c);
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		return sb.toString();
	}

}
