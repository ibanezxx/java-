package homework.ten;//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : StackOfInteger.java
//  @ Date : 2020/4/12
//  @ Author : 
//
//




public class StackOfInteger {
	private int[] element;
	private int size;
	private static final int DEFAULT_CAPACITY=16;

	public void push(int value) {
		if (size>=element.length){
			int[] temp=new int[element.length*2];
			System.arraycopy(element,0,temp,0,element.length);
			element=temp;
		}
			element[size++]=value;
	}
	
	public int pop() {
		return element[--size];
	}
	
	public int peek() {
		return element[size-1];
	}
	
	public boolean empty() {
	return size==0;
	}

	public StackOfInteger() {
		this(DEFAULT_CAPACITY);
	}

	public StackOfInteger(int capacity){
		element=new int[capacity];
	}

	public int getSize() {
		return size;
	}

}
