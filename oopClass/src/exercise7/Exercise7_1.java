package exercise7;

import java.util.*;

public class Exercise7_1 {
	public static void printBig(Vector<Integer> v) {
		int big = v.get(0); // 입력받은 v의 첫번째 요소 저장
		for(int i = 0; i < v.size(); i++) { // 첫번째 요소와 다음 요소 비교 후 큰 것을 big에 할당
			if(big < v.get(i)) {
				big = v.get(i);
			}
		}
		System.out.println("가장 큰 수는 " + big);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		System.out.print("정수(-1이 입력될 때까지)>>");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) {
				break;
			}
			v.add(n);
		}
		
		if(v.size() == 0) { // 입력값이 업다면
			System.out.println("프로그램을 종료합니다.");
			scanner.close();
			return;
		}
		
		printBig(v);
		scanner.close();
	}
}