package com.ds.stack.custom;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCustomStackWithArray();
		System.out.println("CustomStackWithLinkedL");
		testCustomStackWithLinkedL();
		System.out.println("TwoStackWithArrayLE");
		testTwoStackWithArrayLE();
		System.out.println("TwoStackWithArrayEfficient");
		testTwoStackWithArrayEfficient();
	}
	
	public static void testTwoStackWithArrayEfficient() {
		TwoStackWithArrayEfficient stack = new TwoStackWithArrayEfficient(10);
		System.out.println(stack.isEmptyStack1());
		stack.push1(1);
		stack.push1(2);
		stack.push1(3);
		stack.push1(4);
		stack.push1(5);

		stack.push2(10);
		stack.push2(20);
		stack.push2(30);
		stack.push2(40);
		stack.push2(50);

		System.out.println(stack);
		System.out.println("E : " + stack.pop1());
		System.out.println(stack.push1(6));
		System.out.println(stack.isEmptyStack1());

		System.out.println("E : " + stack.pop2());
		System.out.println(stack.push2(60));
		System.out.println(stack);
		System.out.println(stack.isEmptyStack2());
	}

	public static void testTwoStackWithArrayLE() {
		TwoStackWithArrayLE stack = new TwoStackWithArrayLE(10);
		System.out.println(stack.pop1());
		stack.push1(1);
		stack.push1(2);
		stack.push1(3);
		stack.push1(4);
		stack.push1(5);

		stack.push2(10);
		stack.push2(20);
		stack.push2(30);
		stack.push2(40);
		stack.push2(50);

		System.out.println(stack);
		System.out.println("E : " + stack.pop1());
		System.out.println(stack.push1(6));
		System.out.println(stack.isEmptyStack1());

		System.out.println("E : " + stack.pop2());
		System.out.println(stack.push2(60));
		System.out.println(stack);
		System.out.println(stack.isEmptyStack2());
	}

	private static void testCustomStackWithLinkedL() {
		// TODO Auto-generated method stub
		CustomStackWithLinkedL csLinkedL = new CustomStackWithLinkedL();
		System.out.println(csLinkedL.pop());
		System.out.println(csLinkedL.isEmpty());
		csLinkedL.push(1);
		csLinkedL.push(9);
		csLinkedL.push(5);
		csLinkedL.push(7);
		System.out.println(csLinkedL.pop());
		System.out.println(csLinkedL);
		System.out.println(csLinkedL.isEmpty());
		System.out.println(csLinkedL.peek());
		System.out.println(csLinkedL.size());
	}

	private static void testCustomStackWithArray() {
		// TODO Auto-generated method stub
		CustomStackWithArray csArray = new CustomStackWithArray();
		System.out.println(csArray.pop());
		System.out.println(csArray.isEmpty());
		csArray.push(1);
		csArray.push(9);
		csArray.push(5);
		csArray.push(7);
		System.out.println(csArray.pop());
		System.out.println(csArray);
		System.out.println(csArray.isEmpty());
		System.out.println(csArray.peek());
		System.out.println(csArray.size());
	}

}
