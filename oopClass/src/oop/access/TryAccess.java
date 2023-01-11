package oop.access;

class FriendlyChild extends oop.access.Target{
	void tryAll() {
		open();
		successor_open();
		friend_open();
//		not_open();
	}
}

class ForeignChild extends oop.access.foreign.Target{
	void tryAll(){
		open();
		successor_open();
//		friend_open();
//		not_open();
	}
}

public class TryAccess {
	public static void main(String[] args) {
		oop.access.Target t1 = new oop.access.Target();
		t1.open();
		t1.successor_open();
		t1.friend_open();
//		t1.not_open();
		
		oop.access.foreign.Target t2 = new oop.access.foreign.Target();
		t2.open();
//		t2.succssor_open();
//		t2.friend_open();
//		t2.not_open();

		FriendlyChild t3 = new FriendlyChild();
			t3.open();
			t3.successor_open();
			t3.friend_open();
//			t3.not_open();
			
		ForeignChild t4 = new ForeignChild();
		t4.open();
//		t4.successor_open();
//		t4.friend_open();
//		t4.not_open();
	}
}