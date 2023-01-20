package oop.module;

import java.util.StringTokenizer;

public class TokenizerDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(50);
		for(int i = 0; i < 50; i++) {
			char c = (char)(Math.random() * (26 + 4) + 'a'); // a~z,{,\,},~
			sb.append(c);
		}
		System.out.println("Gen: " + sb);
		
		System.out.print("Split: ");
		StringTokenizer st = new StringTokenizer(sb.toString(), "{|}~;");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token + " ");
		}
	}
}