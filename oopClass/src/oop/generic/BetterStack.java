package oop.generic;

import java.util.ArrayList;

public class BetterStack<T extends Fruit> {
	private int maxSize;
	private ArrayList<T> stackArray;
	
	public BetterStack(int size) {
		maxSize = size;
		stackArray = new ArrayList<T>();
	}
	
	public void push(T x) {
		if(maxSize != -1 && stackArray.size() == maxSize) {
			throw new ArrayIndexOutOfBoundsException("Stack overflow!");
		}
		stackArray.add(0, x);
	}
	
	public T pop() {
		return stackArray.remove(0);
	}
	
	public T peek() {
		return stackArray.get(0);
	}
	
	public boolean isEmpty() {
		return stackArray.size() == 0;
	}
	
	public boolean isFull() {
		if(maxSize != -1 && stackArray.size() == maxSize) {
			return true;
		}
		return false;
	}
	
	public int getSize() {
		return stackArray.size();
	}
}