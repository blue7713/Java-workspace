package oop.generic;

public class ObjectStack {
	private int maxSize;
	private Object[] stackArray;
	private int top = -1;
	
	public ObjectStack(int size) {
		maxSize = size;
		stackArray = new Object[maxSize];
	}
	
	public void push(Object x) {
		stackArray[++top] = x;
	}
	
	public Object pop() {
		return stackArray[top--];
	}
	
	public Object peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	
	public int getSize() {
		return top + 1;
	}
}