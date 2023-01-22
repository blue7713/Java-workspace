package oop.generic;

public class OrangeStack {
	private int maxSize;
	private Orange[] stackArray;
	private int top = -1;
	
	public OrangeStack(int size) {
		maxSize = size;
		stackArray = new Orange[maxSize];
	}
	
	public void push(Orange x) {
		stackArray[++top] = x;
	}
	
	public Orange pop() {
		return stackArray[top--];
	}
	
	public Orange peek() {
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