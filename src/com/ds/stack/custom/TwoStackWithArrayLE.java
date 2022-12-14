package com.ds.stack.custom;

public class TwoStackWithArrayLE {

	int[] array;
	int top1;
	int top2;
	int size;
	public TwoStackWithArrayLE(int n){
		array = new int[n];
		top1 = 0;
		top2 = n/2;
		size = n;
	}

	public boolean push1(int a) {
		if (top1 == size/2) {
			System.out.println("Stack is Overflow");
			return false;
		} else {
			array[top1] = a;
			top1++;
			return true;
		}
	}

	public boolean push2(int a) {
		if (top2 == size) {
			System.out.println("Stack is Overflow");
			return false;
		} else {
			array[top2] = a;
			top2++;
			return true;
		}
	}

	public int pop1() {
		if (top1 > 0) {
			int x = array[top1 - 1];
			array[top1 - 1]=0;
			top1--;
			return x;
		} else {
			System.out.println("Stack is Underflow");
			return -1;
		}
	}

	public int pop2() {
		if (top2 >size/2) {
			int x = array[top2 - 1];
			array[top2 - 1]=0;
			top2--;
			return x;
		} else {
			System.out.println("Stack is underflow");
			return -1;
		}
	}

	public int peek1() {
		if (top1 > 0) {
			int x = array[top1 - 1];
			return x;
		} else {
			System.out.println("Stack is Underflow");
			return -1;
		}
	}

	public int peek2() {
		if (top2 > size/2) {
			int x = array[top2 - 1];
			return x;
		} else {
			System.out.println("Stack is underflow");
			return -1;
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
