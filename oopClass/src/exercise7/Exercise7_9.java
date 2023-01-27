package exercise7;

import java.util.*;

interface IStack<T>{
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T>{
	ArrayList<T> l = null;
	
	public MyStack() {
		l = new ArrayList<T>();
	}
	
	@Override
	public T pop() {
		if(l.size() == 0) {
			return null;
		}
		else {
			return l.remove(0);
		}
	}

	@Override
	public boolean push(T ob) {
		l.add(0, ob);
		return true;
	}
}

public class Exercise7_9 {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i = 0; i < 10; i++) { // 10개의 정수 푸시
			stack.push(i);
		}
		
		while(true) { // 스택이 빌 때까지 pop 
			Integer n = stack.pop(); 
			if(n == null) { // 스택이 빈 경우
				break;
			}
			System.out.print(n + " ");
		}
	}
}
