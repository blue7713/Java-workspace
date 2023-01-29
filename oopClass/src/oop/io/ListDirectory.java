package oop.io;

import java.io.*;
import java.util.Arrays;

public class ListDirectory {
	private static class JavaFileFilter implements FilenameFilter{
		@Override
		public boolean accept(File dir, String name) {
			String f = new File(name).getName();
			return f.endsWith(".java");
		}
	}
	
	private static void printSortedList(String[] list) {
		Arrays.sort(list);
		for(String file: list) {
			System.out.println(file);
		}
	}
	
	public static void main(String[] args) {
		File path = new File("."); // current directory!
		printSortedList(path.list());
		System.out.println("=== Java Files ===");
		printSortedList(path.list(new JavaFileFilter()));
	}
}