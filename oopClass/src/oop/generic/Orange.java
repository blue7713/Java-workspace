package oop.generic;

public class Orange implements Fruit{
	private long id;
	
	public Orange(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Orange(" + id + ")";
	}
}