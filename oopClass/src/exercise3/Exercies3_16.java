package exercise3;

import java.util.Scanner;

public class Exercies3_16 {
	public static void main(String[] args) {
		String str[] = {"가위", "바위", "보"};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		// 사용자 입력
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scanner.nextLine(); // 사용자가 낸 것
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			// 컴퓨터가 내는 것
			int n = (int)(Math.random() * 3); // 컴퓨터가 낼 0~2의 인덱스
			String strn = str[n]; // 컴퓨터가 내는 것
		
			System.out.print("사용자 =" + user);
			System.out.print(", 컴퓨터 =" + strn);
			
			if(user.equals("가위")) {
				if(strn.equals("가위")) {
					System.out.print(", 비겼습니다.");	
				}
				else if(strn.equals("바위")) {
					System.out.print(", 컴퓨터가 이겼습니다.");
				}
				else if(strn.equals("보")) {
					System.out.print(", 사용자가 이겼습니다.");
				}	
			}
			else if(user.equals("바위")) {
				if(strn.equals("가위")) {
					System.out.print(", 사용자가 이겼습니다.");	
				}
				else if(strn.equals("바위")) {
					System.out.print(", 비겼습니다.");
				}
				else if(strn.equals("보")) {
					System.out.print(", 컴퓨터가 이겼습니다.");
				}
			}
			else if(user.equals("보")) {
				if(strn.equals("가위")) {
					System.out.print(", 컴퓨터가 이겼습니다.");	
				}
				else if(strn.equals("바위")) {
					System.out.print(", 사용자가 이겼습니다.");
				}
				else if(strn.equals("보")) {
					System.out.print(", 비겼습니다.");
				}
			}
			else {
				System.out.println(", 잘못 냈습니다.");
			}
		}
		scanner.close();
	}
}