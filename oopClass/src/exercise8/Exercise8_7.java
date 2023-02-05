package exercise8;

import java.io.*;
import java.util.Scanner;

public class Exercise8_7 {
	public static void main(String[] args) {
		File a;
		File b;
		FileInputStream fin;
		FileOutputStream fout;
		long n;
		long total;
		try {
			a = new File("C:\\Users\\82105\\OneDrive\\바탕 화면\\eclipse-workspace\\Java-workspace\\oopClass\\a.jpeg");
			b = new File("C:\\Users\\82105\\OneDrive\\바탕 화면\\eclipse-workspace\\Java-workspace\\oopClass\\b.jpeg");
			
			System.out.println(a.getName() + "를 " + b.getName() + "로 복사합니다.");
			System.out.println("10%마다 *를 출력합니다.");
			fin = new FileInputStream(a); // 파일 읽어들임
			fout = new FileOutputStream(b); // 파일 출력
			
			int c;
			n = 0;
			total = a.length(); // 파일의 바이트크기읽기
			
			while((c = fin.read()) != -1) { // 파일을 모두 읽을 때까지 반복
				fout.write((byte)c); // 파일쓰기
				n = (n + 1);
				if(n == total / 10) { // 10%마다 출력...?
					System.out.print("*");
					n = 0;
				}
			}
			fin.close();
			fout.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}