package exercise5;

import java.util.Scanner;

interface Stack{
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱(top)에 실수 저장
	boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
}

class StackApp implements Stack{
	private int size; // 배열의 크기 
	private int count; // 베열에 저장된 String 갯수를 셈
	private String array[]; // 입력된 String을 저장할 배열
	
	public StackApp(int size) { // 배열이 크기 설정
		this.count = 0;
		this.size = size;
		array = new String[size];
	}
	
	@Override
	public int length() { // 현재 스택에 저장된 개수 리턴
		return count;
	}

	@Override
	public int capacity() { // 스택의 전체 저장 가능한 개수 리턴
		return array.length;
	}

	@Override
	public String pop() { // 스택에 톱(top)에 실수 저장
		if(count - 1 < 0) {
			return null;
		}
		count--;
		return array[count];
	}

	@Override
	public boolean push(String val) { // 스택에 톱(top)에 저장된 실수 리턴
		if(count < size ) {
			array[count] = val;
			count++;
			return true;
		}
		else{
			return false;
		}
	}
}

public class Exercise5_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("총 스택 저장 공간 크기 입력 >>");
		int size = scanner.nextInt(); // 스택 공간의 크기 저장
		
		StackApp app = new StackApp(size);
		while(true) {
			System.out.print("문자열 입력 >>");
			String temp = scanner.next(); // 스택 공간에 저장될 문자열을 입력받음
			if(temp.equals("그만")) {
				break;
			}
			if(!app.push(temp)) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		System.out.print("스택에 저장된 모든 문자열 팝:");
		int len = app.length(); // 여기가 문제 왜??????
		for(int i = 0; i < len; i++) {
			System.out.print(app.pop() + " ");
		}
		scanner.close();
	}
}