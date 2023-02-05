package exercise8;

import java.io.*;

public class Exercise8_2 {
	public static void main(String[] args) {
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		int c;
		
		try {
			f = new File("C:\\temp\\phone.txt");
			fr = new FileReader(f);
			System.out.println(f.getPath() + "를 출력합니다.");
			/*while((c = fr.read()) != -1) {
				System.out.print((char)c);
			}
			fr.close();*/
			br = new BufferedReader(fr, 30);
			String temp = "";
			while(true) {
				temp = br.readLine();
				if(temp == null) {
					break;
				}
				System.out.println(temp);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}