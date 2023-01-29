package oop.io;

import java.io.*;

public class TestRandomAccessFile {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("C:\\test_file.dat", "rw");
		System.out.println("fp position: " + raf.getFilePointer());
		
		raf.writeByte(Byte.MAX_VALUE); // 8bits(1byte)
		System.out.println("fp position:" + raf.getFilePointer());
		
		raf.writeShort(Short.MIN_VALUE); // 16bits(2byte)
		System.out.println("fp position:" + raf.getFilePointer());
		
		raf.writeChar('X'); // 16bits(2byts)
		System.out.println("fp position:" + raf.getFilePointer());
		
		raf.writeInt(Integer.MAX_VALUE); // 32bits(4byte)
		System.out.println("fp position:" + raf.getFilePointer());
		
		raf.writeLong(Long.MIN_VALUE); // 64bits(8byte)
		System.out.println("fp position:" + raf.getFilePointer());
		
		raf.writeFloat(Float.MAX_VALUE); // 32bits(4byte)
		System.out.println("fp position:" + raf.getFilePointer());
		
		raf.writeDouble(Double.MIN_NORMAL); // 64bits(8byte)
		System.out.println("fp position:" + raf.getFilePointer());
		
		raf.write("Hello World".getBytes());
		System.out.println("fp postion:" + raf.getFilePointer());
		
		raf.write("Hello World".getBytes("UTF-8"));
		System.out.println("fp position:" + raf.getFilePointer());
		
		raf.seek(0);
		
		System.out.println("========================");
		System.out.println("byte:" + raf.readByte());
		System.out.println("short:" + raf.readShort());
		System.out.println("char:" + raf.readChar());
		System.out.println("int:" + raf.readInt());
		System.out.println("float:" + raf.readFloat());
		System.out.println("double:" + raf.readDouble());
		System.out.println("line:" + raf.readLine());
		
		raf.close();
	}
}