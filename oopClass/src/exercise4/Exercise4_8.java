package exercise4;

import java.util.Scanner;

public class Exercise4_8 {
	static class Phone{
		private String name;
		private String tel;
		
		public Phone(String name, String tel) {
			this.name = name;
			this.tel = tel;
		}
		
		public String getName() {
			return name;
		}
		
		public String getTel() {
			return tel;
		}
	}
	
	static class PhoneBook{
		Scanner scanner = new Scanner(System.in);
		private int arraySize;
		private String name;
		private String tel;
		Phone phone[];
		
		public void getArraySize() { // 배열 크기 생성
			System.out.print("인원수>>");
			arraySize = scanner.nextInt();
			phone = new Phone[arraySize];
		}
		
		public void getInfo() { // 이름과 전화번호를 할당받아 저장
			for(int i = 0; i < phone.length; i++) {
				System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
				name = scanner.next();
				tel = scanner.next();
				phone[i] = new Phone(name, tel);
			}
			System.out.println("저장되었습니다.");
		}
		
		public void Search() {
			boolean state = false;
			while(true) {
				System.out.print("검색할 이름");
				name = scanner.next();
				
				if(name.equals("그만")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
				for(int i = 0; i < phone.length; i++) {
					if(name.equals(phone[i].getName())) {
						System.out.println(name + "의 번호는 " + phone[i].getTel() + "입니다.");
						state = true;
					}
				}
				
				if(state == false) {
					System.out.println(name + "이 없습니다.");
				}
			}
		}
		
		public static void main(String args[]) {
			PhoneBook phonebook = new PhoneBook();
			phonebook.getArraySize();
			phonebook.getInfo();
			phonebook.Search();
		}
	}
}