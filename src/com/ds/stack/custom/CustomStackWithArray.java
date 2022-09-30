package com.ds.stack.custom;

public class CustomStackWithArray {
	
	private final int MAX_SIZE = 100;
	private int [] array = new int[MAX_SIZE];
	int top;
	public CustomStackWithArray(){
		this.top = -1;
	}

	public boolean push(int i) {
		// TODO Auto-generated method stub
		if(top>MAX_SIZE){
			System.out.println("Stack is Overflow");
			return false;
		} else {
			array[++top]=i;
			return true;
		}
		
	}
	
	public int pop() {
		// TODO Auto-generated method stub
		if(top<0){
			System.out.println("Stack is underflow");			
		} else {
			int x = array[top];
			array[top--] = 0;
			return x;
		}
		return 0;
	}
	
	public int size(){
		return ++top;
	}
	
	public int peek() {
		// TODO Auto-generated method stub
		if(top<0){
			System.out.println("Stack is underflow");
			return 0;
		} else {
			int x = array[top];
			return x;
		}
	}
	
	public boolean isEmpty(){
		return top<0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(int a : array){
			if(a != 0)
			sb.append(a + " ");
		}
		sb.append(']');
		return sb.toString();
	}

	

}
