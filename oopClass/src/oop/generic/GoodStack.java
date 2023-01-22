package oop.generic;

public class GoodStack<T> {
	private int maxSize;
	private Object[] stackArray;
	private int top = -1;
	
	public GoodStack(int size) {
		maxSize = size;
		stackArray = new Object[maxSize];
	}
	
	public void push(T x) {
		stackArray[++top] = x;
	}
	
	public T pop() {
		return (T) stackArray[top--];
	}
	
	public T peek() {
		return (T) stackArray[top];
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