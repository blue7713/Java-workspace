package oop.inheritance;

public class ValueObject {
	private int value;
	private boolean flag;
	
	public ValueObject(int x, boolean b) {
		this.value = x;
		this.flag = b;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ValueObject)) {
			return false;
		}
		ValueObject that = (ValueObject) obj;
		return this.value == that.value && this.flag == that.flag;
	}

	@Override
	public String toString() {
		return "ValueObject(" + value + "," + flag + ")";
	}
	
}