package oop.generic;

public class AppleStack {
	private int maxSize;
	private Apple[] stackArray;
	private int top = -1;
	
	public AppleStack(int size) {
		maxSize = size;
		stackArray = new Apple[maxSize];
	}
	
	public void push(Apple x) {
		stackArray[++top] = x;
	}
	
	public Apple pop() {
		return stackArray[top--];
	}
	
	public Apple peek() {
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