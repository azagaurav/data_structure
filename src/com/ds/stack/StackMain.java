package com.ds.stack;

public class StackMain {

	public static void main(String[] args) {
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
