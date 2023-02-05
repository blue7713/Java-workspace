package exercise8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise8_1 {
	public static void main(String[] args) {
		File f = null;
		FileWriter fw = null;
		
		try {
			f = new File("C:\\temp\\phone.txt");
			fw = new FileWriter(f);
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = scanner.nextLine();
				if(line.equals("그만")) {
					break;
				}
				fw.write(line + "\r\n");
			}
			scanner.close();
			fw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.getPath() + "에 저장하였습니다.");
	}
}