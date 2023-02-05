package exercise8;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

public class Exercise8_11 {
	public static void main(String[] args) {
		FileReader fr = null;
		Vector<String> v;
		Scanner scanner;
		
		try {
			fr = new FileReader(new File("C:\\Temp\\word.txt"));
			v = new Vector<String>();
			scanner = new Scanner(fr);
			String word = "";
			
			while(scanner.hasNext()) {
				word = scanner.next();
				v.add(word);
			}
			System.out.println("temp폴더 밑의 word.txt 파일을 읽었습니다...");
			
			scanner.close();
			scanner = new Scanner(System.in);
			
			while(true) {
				boolean find = false;
				System.out.print("단어>> ");
				word = scanner.next();
				if(word.equals("그만")) {
					break;
				}
				for(int i = 0; i < v.size(); i++) {
					String w = v.get(i);
					if(w.length() < word.length()) {
						continue;
					}
					
					String sub = w.substring(0, word.length());
					if(sub.equals(word)) {
						System.out.println(w);
						find = true;
					}
				}
				if(!find) {
					System.out.println("발견할 수 없음");
				}
			}
			System.out.println("종료합니다...");
			scanner.close();
			fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}