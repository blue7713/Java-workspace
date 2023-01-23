package oop.generic;

public class Apple implements Fruit{
	private long id;
	
	public Apple(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Apple(" + id + ")";
	}
}