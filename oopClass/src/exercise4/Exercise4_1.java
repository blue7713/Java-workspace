package exercise4;

class TV{
	private String brand;
	private int year;
	private int size;
	
	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.print(brand + "에서 만든 ");
		System.out.print(year + "년형 ");
		System.out.println(size + "인치 TV");
	}	
}

public class Exercise4_1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); // LG에서 마든 2017년 32인치
		myTV.show();
	}
}