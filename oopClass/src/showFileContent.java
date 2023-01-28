import java.io.IOException;

public class showFileContent {
	public static void main(String[] args) {
		int c;
		try {
			do {
				c = System.in.read();
//				System.out.print(c);
				System.out.print(false);
			}
			while(c != -1);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}