package oop.io;

import java.io.File;
import java.io.IOException;

public class PrintFileInfo {
	public static void main(String[] args) throws IOException{
		File f = new File(".");
		String out = String.format("AbsolutePath=%s\nCanonicalPath=&s\ngetPath=\ngetParent=%s\ngetName=%s",
				f.getAbsolutePath(), f.getCanonicalPath(), f.getPath(), f.getParent(), f.getName());
		System.out.println(out);
		
		out = String.format("canRead=%b\ncanWrite=%b\ncanExecute=%b\nlength=%d\nlastModified=%d",
				f.canRead(), f.canWrite(), f.canExecute(), f.length(), f.lastModified());
		System.out.println(out);
		
		if(f.isFile()) {
			System.out.println("it's a file");
		}
		else if(f.isDirectory()) {
			System.out.println("it's a directory");
		}
		else {
			System.out.println("i don't know. What else?");
		}
	}
}