package exercise3;

import java.util.Scanner;

public class Exercise3_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 몇개?");
		int n = scanner.nextInt();
		int array[] = new int[n]; // 입력받은 수 만큼의 배열 크기
		if(n > 100 || n < 1) { // 음수x, 100보다 작은 크기의 배열 제한
			System.out.println("100미만의 정수를 입력하세요");
		}
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1; // 1~100까지의 수 랜덤으로 할당
			for(int j = 0; j < i; j++) { 
				if(array[i] == array[j]) { // 같은 값이 있다면 다시 랜덤 값 할당
					i--;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if((i + 1) % 10 == 0) {
				System.out.println(); // 10개마다 줄바꿈
			}
		}
		scanner.close();
	}
}