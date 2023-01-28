import java.io.*;

public class LineEdit {
	public static void main(String[] args) throws IOException {
//		DataInputStream input = new DataInputStream(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String lines[] = new String[100];
		System.out.println("Enter lines of text.\nEnter 'quit' to stop.");
		for(int i = 0; i < 100; i++) {
			lines[i] = input.readLine();
			if("quit".equals(lines[i])) {
				break;
			}
			
		System.out.println("\n============");
		for(int j = 0; j < 100; j++) {
			if("quit".equals(lines[j])) {
				break;
			}
			System.out.println(lines[j]);
			}
		}
	}
}