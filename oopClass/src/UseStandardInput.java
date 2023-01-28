import java.io.IOException;

public class UseStandardInput {
	public static void main(String[] args) {
		char c;
		System.out.println("Enter characters. 'q/Q' to quit.");
		try {
			do {
				c = (char)System.in.read();
				System.out.print(c);
			}
			while(c != 'q' && c != 'Q');
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}