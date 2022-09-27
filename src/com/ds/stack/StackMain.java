package com.ds.stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCustomStackWithArray();
		System.out.println("CustomStackWithLinkedL");
		testCustomStackWithLinkedL();
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
