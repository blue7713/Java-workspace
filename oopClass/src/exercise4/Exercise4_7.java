package exercise4;

import java.util.Scanner;

public class Exercise4_7 {
	
	static class Day{
		private String work; // 하루의 할 일을 나타내는 문자열
	
	public void set(String work) {
		this.work = work;
		}
	
	public String get() {
		return work;
		}
	
	public void show() {
		if(work == null) {
			System.out.println("없습니다.");
		}
		else {
			System.out.println(work + "입니다.");
		}
	}	
}
	
	static class MonthSchedule{
		private Day days[];
		private Scanner scanner;
		
		public MonthSchedule(int day) {
			scanner = new Scanner(System.in);
			this.days = new Day[day];
			for(int i = 0; i < days.length; i++) {
				days[i] = new Day();
			}
		}
		
		public void input() {
			scanner = new Scanner(System.in);
			System.out.println("날짜(1~30)?");
			int day = scanner.nextInt();
			System.out.print("할일(빈칸없이입력)");
			String work = scanner.next();
			day--;
			if(day < 0 || day > 30) { 
				System.out.println("날짜를 잘못 입력하였습니다.");
				return;
			}
			days[day].set(work);
		}
		
		public void view() {
			System.out.print("날짜(1~30)");
			int day = scanner.nextInt();
			day--;
			if(day < 0 || day > 30) {
				System.out.println("날짜를 잘못 입력하였습니다.");
				return;
			}
			System.out.print((day + 1) + "일의 할 일은 ");
			days[day].show();
		}
		
		public void finish() {
			System.out.println("프로그램을 종료합니다.");
			scanner.close();
		}
		
		public void run() {
			System.out.print("이번달 스케줄 관리 프로그램");
			while(true) {
				System.out.println();
				System.out.print("할일(입력: 1, 보기: 2, 끝내기: 3)");
				int select = scanner.nextInt();
				switch(select) {
					case 1: input();
						break;
					case 2: view();
						break;
					case 3: finish();
						return;
				}
			}
		}	
	}
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 할 일
		april.run();

		}
}