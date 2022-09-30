package com.ds.stack.custom;

public class CustomStackWithLinkedL {
	private StackNode root;
	int size=0;
	
	public static class StackNode{
		public int data;
		public StackNode next;
		
		public StackNode(int data){
			this.data = data;
		}		
	}
	
	public void push(int i){
		if(root == null){
			root = new StackNode(i);
		} else{
			StackNode temp = root;
			root = new StackNode(i);
			root.next = temp;
		}
		size++;
	}
	
	public int pop(){
		if(root == null){
			System.out.println("Stack is underflow");
			return 0;
		} else{
			int x= root.data;
			root = root.next;
			size--;
			return x;
		}		
	}
	
	public  int peek(){
		if(root == null){
			System.out.println("Stack is underflow");
			return 0;
		} else{
			return root.data;
		}	
	}
	
	public boolean isEmpty(){
		return root==null;
	}
	
	public int size(){
		return size;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		if(root != null){
			StackNode temp = root;
			while(temp!=null){
				sb.append(temp.data+" ");
				temp = temp.next;
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
