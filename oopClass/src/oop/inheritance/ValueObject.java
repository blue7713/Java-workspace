package oop.inheritance;

public class ValueObject implements Comparable<ValueObject>{
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

	@Override
	public int compareTo(ValueObject that) {
		return (this.value < that.value) ? -1 : ((this.value == that.value) ? 0 : 1);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}