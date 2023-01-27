package exercise7;

import java.util.Scanner;
import java.util.Vector;
import java.util.InputMismatchException;

class Word{ // 영어 단어와 한글 단어를 쌍으로 가진 하나의 단어 표현
	private String english; // 영어 단어
	private String korean; // 영어 단어에 해당하는 한글 단어
	
	public Word(String english, String korean) {
		this.english = english;
		this.korean = korean;
	}
	
	public String getEnglish() {
		return english;
	}
	
	public String getKorean() {
		return korean;
	}
}

class WordQuiz{
	Scanner scanner = new Scanner(System.in);
	private String name; // 퀴즈 프로그램 이름
	private Vector<Word> v;
	
	public WordQuiz(String name) {
		this.name = name;
		v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
		v.add(new Word("animla", "동물"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("human", "인간"));
		v.add(new Word("stock", "주식"));
		v.add(new Word("trade", "거래"));
		v.add(new Word("society", "사회"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("honey", "꿀"));
		v.add(new Word("dall", "인형"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("fault", "오류"));
		v.add(new Word("example", "보기"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("statue", "조각상"));
	}
	
	// ex[] 배열에 4개의 보기를 만든다. 보기는 현재 단어 벡터에 있는 단어를 랜덤하게 4개를 선택하고,
	// 벡터에 대한 인덱스를 ex[] 배열에 저장한다.
	// answerIndex는 정답이 있는 벡터의 인덱스이므로, ex[]에는 answerIndex 값이 들어가지 않도록 한다.
	// 그러므로 이 메소드가 리턴할 때는 answerIndex가 없는 ex[] 배열이 만들어지며,
	// ex[]배열에 대한 임의의 인덱스를
	// 리턴한다. 이 메소드가 끝난 뒤 이 위치에 answerIndex를 심는다.
	
	private int makeExample(int ex[], int answerIndex) {
		int n[] = {-1, -1, -1, -1}; // -1로 초기화
		int index;
		for(int i = 0; i < n.length; i++) {
			do {
				index = (int)(Math.random() * v.size());
			}
			while(index == answerIndex || exists(n, index));
			n[i] = index;
		}
		
		for(int i = 0; i < n.length; i++) {
			ex[i] = n[i];
		}
		return(int)(Math.random() * n.length); // ex[]배열 내의 임의의 위치 리턴
	}
	
	// 배열 n[]에 index의 값이 존재하면 true, 아니면 false 리턴
	private boolean exists(int n[], int index) {
		for(int i = 0; i < n.length; i++) {
			if(n[i] == index) {
				return true;
			}
		}
		return false;
	}
	
	public void quiz() {
		System.out.println("\"" + name + "\"" + "의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
		while(true) {
			int answerIndex = (int)(Math.random() * v.size()); // 정답이 들이 있는 벡터 항목의 인덱스
			String eng = v.get(answerIndex).getEnglish(); // 문제로 주어질 영어 단어
			
			// 4개의 보기를 만들 벡터의 index배열
			int example[] = new int[4];
			
			int answerLoc = makeExample(example, answerIndex); // 정답이 있는 보기 번호
			example[answerLoc] = answerIndex; // 보기에 정답 인덱스 저장
			
			// 문제 출력
			System.out.println(eng + "?");
			for(int i = 0; i < example.length; i++) {
				System.out.print("(" + (i + 1) + ")" + v.get(example[i]).getKorean() + " "); // 보기 출략
			}
			
			System.out.print(":>"); // 프롬프트
			try {
				int in = scanner.nextInt(); // 사용자의 정답 입력
				if(in == -1) {
					break; // 프로그램 종료
				}
				// 사용자가 1~4사이의 정답 입력
				in--; // 1~4를 0~3의 인덱스로 바꿈
				if(in == answerLoc) {
					System.out.println("Excellent!!");
				}
				else {
					System.out.println("No. !!");
				}	
			}
			catch(InputMismatchException e) {
				scanner.next(); // 현재 스트림 버퍼에 입력되어 있는 입력을 읽어서 제거함
				System.out.println("숫자를 입력하세요!!");
				//while 문으로 다시 반복
			}
		}
	}
	
	private boolean contains(String eng) {
		for(int i = 0; i < v.size(); i++) {
			if(v.get(i).getEnglish().equals(eng)) { // 사용자가 입력한 단어가 이미 있다면
				return true;
			}
		}
		return false;
	}
	
	public void insert() {
		System.out.print("현재 " + v.size() + "개 단어가 입력되어 있습니다.");
		System.out.println("-1을 입력하면 테스트를 종료합니다.");
		while(true) {
			System.out.print("영어 한글 입력>> ");
			String english = scanner.next();
			if(english.equals("그만")) {
				break;
			}
			String capital = scanner.next();
			
			if(contains(english)) {// 사용자가 입력한 단어가 이미 있다면
				System.out.println(english + "는 이미 있습니다.");
				continue;
			}
			
			v.add(new Word(english, capital)); // 벡터에 객체 추가
		}
	}
	
	public void run() {
		System.out.println("****영어 단어 테스트 프로그램\"명품영어\"입니다.****");
		while(true) {
			System.out.print("단어테스트:1, 단어 삽입:2, 종료:3 >> ");
			int select = scanner.nextInt();
			switch(select) {
			case 1:
				quiz();
				break;
			case 2:
				insert();
				break;
			case 3:
				scanner.close();
				System.out.println("게임을 종료합니다.");
				return;
			}
		}
	}
}

public class Exercise7_12 {
	public static void main(String[] args) {
		WordQuiz quiz = new WordQuiz("명품영어");
		quiz.run();
	}
}