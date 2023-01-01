package exercise3;

import java.util.Scanner;

public class Exercise3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("소문자 알파벳 하나를 입력하시오>>");
		String n = scanner.next();
		
		char c = n.charAt(0); // c에 n값 차례로 입력			
		int asccode = (int)c;
		if(asccode < 97 || asccode > 122) { // ASCII 코드값 97~122 사이는 소문자 알파벳
			System.out.println("잘못된 값입니다.");
			}
		
		for(int i = asccode; i > 96; i--) { // ASCII코드 97까지 줄이며 반복 출력
			for(int j = 97; j < i + 1; j++) { // ASCII코드 97부터 입력받은 알파벳까지 출력
				System.out.print((char)j);
				}
			System.out.println(); // 줄바꾸기
			}
		scanner.close();
	}
}