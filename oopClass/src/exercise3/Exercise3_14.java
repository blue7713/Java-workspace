package exercise3;

import java.util.Scanner;

public class Exercise3_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String course [] = {"Java", "C++", "HTML5", "컴퓨토구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		System.out.println("과목 이름>>");
		String name = scanner.next();
		
		// 기존 과목에 있을 경우
		for(int i = 0; i < course.length; i++) { 
			if(course[i].equals(name)) {
				System.out.println(course[i] + "의 점수는 " + score[i]);
				break;
				}
			else { // 기존 과목에 없을 경우
				System.out.println("없는 과목입니다.");
				break;
			}
		}
		scanner.close();
	}
}