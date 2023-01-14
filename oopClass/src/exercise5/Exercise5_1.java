package exercise5;

class TV{
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int colorKinds;
	
	public ColorTV(int size, int colorKinds){
		super(size);
		this.colorKinds = colorKinds;
	}
	
	public void printProperty() {
		System.out.println(getSize() + "인치 " + colorKinds + "컬러");
	}
}

public class Exercise5_1 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}