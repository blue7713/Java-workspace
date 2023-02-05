package exercise8;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise8_4 {
	public static void main(String[] args) {
		File f = null;
		FileReader fr = null;
		
		try {
			f = new File("C:\\windows\\system.ini");
			fr = new FileReader(f);
			Scanner scanner = new Scanner(fr);
			System.out.println(f.getPath() + " 파일을 읽어 출력합니다.");
			int i = 0;
			while(scanner.hasNext()) { // 파일에 읽을 내용이 있는 동안
				i++;
				String line = scanner.nextLine(); // 파일에서 한 라인 읽기
				System.out.printf("%4d" + ": ", i); // i의 라인번호를 가진 int 변수
				System.out.println(line);
			}
			fr.close();
			scanner.close();
			fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}