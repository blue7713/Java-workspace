package oop.generic;

public class GoodStack<T extends Fruit> {
	private int maxSize;
	private int currentSize;
	private Fruit[] stackArray;
	private int top = -1;
	
	public GoodStack(int size) {
		maxSize = size;
		currentSize = (maxSize == -1) ? 5 : size;
		stackArray = new Fruit[maxSize];
	}
	
	public void push(T x) {
		if(maxSize == -1 && getSize() == currentSize) {
			growStack();
		}
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
		if(maxSize == -1) {
			return false;
		}
		return (top == maxSize - 1);
	}
	
	public int getSize() {
		return top + 1;
	}
	
	private void growStack() {
		Fruit[] newStack = new Fruit[currentSize + 1];
		System.arraycopy(stackArray, 0, newStack, 0, currentSize++);
		stackArray = newStack;
		System.out.println("length grows " + (currentSize - 1) + " to " + currentSize);
	}
}