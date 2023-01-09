package exercise4;

import java.util.Scanner;

public class Exercise4_10 {
	static class Dictionary{
		private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
		private static String [] eng = {"love", "baby", "money", "future", "hope"};
		
		private static String kor2Eng(String word) {
			for(int i = 0; i < kor.length; i++) {
				if(word.equals(kor[i])) {
					return eng[i];
				}
			}
			return null;
		}
	
	static class dicApp{
		Scanner scanner = new Scanner(System.in);
		String word;
		
		private void run() {
			while(true) {
				System.out.print("한글 단어?");
				word = scanner.next();
				
				if(word.equals("그만")) {
					break;
				}
				
				String result = Dictionary.kor2Eng(word);
				if(result == null) {
					System.out.println(word + "는 저의 사전에 없는 단어입니다.");
				}
				else {
					System.out.println(word + "은 " + result + "입니다.");
				}
			}
		}
	}
	public static void main(String[] args) {
		dicApp dintionary = new dicApp();
		System.out.println("한영 단어 검색 프로그램입니다.");
		dintionary.run();
		}
	}
}