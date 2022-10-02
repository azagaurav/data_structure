package com.ds.stack.reverse.stack;

import java.util.Stack;

public class ReverseStackWithRecursion {
	
	public static Stack<Integer> stack = null;
	public static Stack<Integer> reversedStack = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stack = createStack(new Stack<Integer>());
		System.out.println(stack);
		reverseStack();
		System.out.println(reversedStack);
	}

	private static void reverseStack() {
		// TODO Auto-generated method stub
		if(!stack.isEmpty()){
			reversedStack.push(stack.pop());
			reverseStack();
		}
	}

	public static Stack<Integer> createStack(Stack<Integer> stack) {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		return stack;
	}

}
