package com.ds.stack.custom;

public class TwoStackWithArrayEfficient {
	
	int [] array;
	int top1;
	int top2;
	int size;
	
	public TwoStackWithArrayEfficient(int n){
		array = new int [n];
		top1 = 0;
		top2 = n-1;
		size = n;
	}
	
	public boolean push1(int i){
		if(top1>=0){
			if(array[top1] == 0){
				array[top1] = i;
				top1++;
				return true;
			} else {
				System.out.println("Stack is Overflow");
				return false;
			}
		} else {
			System.out.println("Stack is Overflow");
			return false;
		}
		
	}
	
	public boolean push2(int i){
		if(top2<size){
			if(array[top2] == 0){
				array[top2] = i;
				top2--;
				return true;
			} else {
				System.out.println("Stack is Overflow");
				return false;
			}
		} else {
			System.out.println("Stack is Overflow");
			return false;
		}
		
	}
	public int pop1(){
		System.out.println(top1);
		if(top1>0){
			int x = array[top1-1];
			array[top1-1] = 0;
			top1--;
			return x;
		}else{
			System.out.println("Stack is Underflow");
			return -1;
		}
	}
	
	public int pop2(){
		if(top2>0){
			int x = array[top2+1];
			array[top2+1]=0;
			top2++;
			return x;
		}else{
			System.out.println("Stack is Underflow");
			return -1;
		}
	}
	
	public boolean isEmptyStack1(){
		if(top1==0)
			return true;
		return false;
	}
	
	public boolean isEmptyStack2(){
		if(top2 == size-1)
			return true;
		return false;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Stack 1 : [");
		int k=0;
		for(int j : array){
			if(k==size/2){
				sb.append("] Stack 2 : [");
			}
			sb.append(j+" ");
			k++;
		}
		sb.append("]");
		return sb.toString();
	}

}
