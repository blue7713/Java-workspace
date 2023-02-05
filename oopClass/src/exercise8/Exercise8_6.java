package exercise8;

import java.util.Scanner;
import java.io.*;

public class Exercise8_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream f1 = null;
		FileInputStream f2 = null;
		FileOutputStream f3 = null;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		System.out.print("첫번째 파일 이름을 입력하세요>> ");
		String s1 = scanner.nextLine();
		
		System.out.print("두번째 파일 이름을 입력하세요>> ");
		String s2 = scanner.nextLine();
		
		try {
			f1 = new FileInputStream(s1); // 파일을 읽어 들임
			f2 = new FileInputStream(s2);
			f3 = new FileOutputStream(new File("appended.txt")); // 새로운 파일을 만듬
			
			byte[] buff = new byte[1024];
			while(true) {
				int n = f1.read(buff); // 입력스트림에서 1024크기만큼 바이트를 읽음, 실제 읽은 바이트 수 리턴
				f3.write(buff, 0, buff.length); // f3에 len크기만큼 0부터 배열 buff를 출력 스트림으로 출력
				if(n < buff.length) {
					break;
				}
			}
			while(true) {
				int n = f1.read(buff);
				f3.write(buff, 0, buff.length);
				if(n < buff.length) {
					break;
				}
			}
			
			System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
			f1.close();
			f2.close();
			f3.close();
			
			scanner.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}