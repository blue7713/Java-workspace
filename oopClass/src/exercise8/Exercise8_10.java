package exercise8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise8_10 {
	public static void main(String[] args) {
		File f = null;
		FileReader fr = null;
		HashMap<String, String> phone;
		Scanner scanner;
		try {
			f = new File("C:\\temp\\phone.txt");
			fr = new FileReader(f);
			phone = new HashMap<String, String>();
			scanner = new Scanner(fr);
			
			while(scanner.hasNext()) {
				String n = scanner.next();
				String t = scanner.next();
				phone.put(n, t);
				//System.out.println("Key:" + n + "value:" + phone.get(n));
			}
			System.out.println("총 " + phone.size() + "개의 정보를 읽었습니다.");
			scanner.close();
			scanner = new Scanner(System.in);
			String temp = "";
			while(true) {
				System.out.print("이름>>");
				temp = scanner.next();
				//System.out.println(temp);
				if(temp.equals("그만")) {
					break;
				}
				String tel = phone.get(temp);
				if(tel == null) {
					System.out.println("찾는 이름이 없습니다.");
				}
				else {
					System.out.println(tel);
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}