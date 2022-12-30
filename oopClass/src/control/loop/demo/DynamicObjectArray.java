package control.loop.demo;

import java.util.Arrays;
import java.util.Random;

class ValueObject{
	char value;
	
	public ValueObject(char c) {
		this.value = c;
	}
	public String toString() {
		return "V(" + value + ")";
	}
}

public class DynamicObjectArray {
	public static void main(String[] args) {
		Random r = new Random();
		ValueObject[] dynamicArray = new ValueObject[r.nextInt(10)];
		for(int i = 0; i < dynamicArray.length; i++) {
			char c = (char)('a' + r.nextInt(26));
			dynamicArray[i] = new ValueObject(c);
		}
		System.out.println("dynamicArray" + Arrays.toString(dynamicArray));
	}
}