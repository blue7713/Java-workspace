package exercise5;

class IPTV extends ColorTV{
	private String IP;
	
	public IPTV(String url, int size, int colorKinds) {
		super(size, colorKinds);
		this.IP = url;
	}
	
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 " + IP + "주소의 ");
		super.printProperty();
	}
}

public class Exercise5_2 {
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}