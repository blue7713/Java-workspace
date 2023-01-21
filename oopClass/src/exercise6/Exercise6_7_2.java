package exercise6;

import java.util.Scanner;

public class Exercise6_7_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			String [] wordCount = s.split(" ");
			System.out.println("어절 개수는 " + wordCount.length);
		}
		scanner.close();
	}
}