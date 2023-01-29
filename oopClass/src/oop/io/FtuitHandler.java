package oop.io;

import java.io.*;
import java.util.Random;

import oop.generic.*;

public class FtuitHandler {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Random r = new Random();
		int size = r.nextInt(10) + 10;
		
		String file = "C:\\object_out.dat";
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
		Fruit[] f = new Fruit[size];
		for(int i = 0; i < size; i++) {
			f[i] = r.nextBoolean() ? new Apple(i) : new Orange(i);
			System.out.println("Generated: " + f[i]);
			out.writeObject(f[i]);
		}
		out.close();
		System.out.println("Total " + size + " fruits are saved.");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
		for(int i = 0; i < size; i++) {
			System.out.println("I've got this: " + in.readObject());
		}
		in.close();
	}
}