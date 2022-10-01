package com.ds.stack.custom;

public class TwoStackWithArrayLE {

	int[] array = new int[10];
	int MAX_SIZE1 = 10 / 2;
	int top1 = 0;
	int top2 = 5;

	public boolean push1(int a) {
		if (top1 == 5) {
			System.out.println("Stack is Overflow");
			return false;
		} else {
			array[top1] = a;
			top1++;
			return true;
		}
	}

	public boolean push2(int a) {
		if (top2 == 10) {
			System.out.println("Stack is Overflow");
			return false;
		} else {
			array[top2] = a;
			top2++;
			return true;
		}
	}

	public int pop1() {
		if (top1 <= 0) {
			System.out.println("Stack is Underflow");
			return -1;
		} else {
			int x = array[top1 - 1];
			top1--;
			return x;
		}
	}

	public int pop2() {
		if (top2 <= 5) {
			System.out.println("Stack is underflow");
			return -1;
		} else {
			int x = array[top2 - 1];
			top2--;
			return x;
		}
	}

	public int peek1() {
		if (top1 <= 0) {
			System.out.println("Stack is Underflow");
			return -1;
		} else {
			int x = array[top1 - 1];
			return x;
		}
	}

	public int peek2() {
		if (top2 <= 5) {
			System.out.println("Stack is underflow");
			return -1;
		} else {
			int x = array[top2 - 1];
			return x;
		}
	}

	public boolean isEmptyStack1() {
		return top1 <= 0;
	}

	public boolean isEmptyStack2() {
		return top2 <= 5;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Stack 1 : [");
		int j = 0;
		for (int i : array) {
			if (j == 5) {
				sb.append("] Stack 2 : [");
			}
			sb.append(i + " ");
			j++;
		}
		sb.append("]");
		return sb.toString();

	}

}
