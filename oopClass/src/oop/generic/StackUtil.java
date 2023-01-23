package oop.generic;

public class StackUtil {
	public static <T extends Fruit> void printStack(BetterStack<T> stack) {
		System.out.print("stack = [");
		BetterStack<T> temp = new BetterStack<T>(-1);
		while(!stack.isEmpty()) {
			T item = stack.pop();
			System.out.print(item.toString() + (stack.isEmpty() ? "]\n" : ", "));
			temp.push(item);
		}
		
		while(!temp.isEmpty()) {
			stack.push(temp.pop());
		}
	}
	
//	public static void empty(BetterStack<?> stack) {
//		while(!stack.isEmpty()) {
//			stack.pop();
//		}
//	}
	
	public static <T extends Fruit> void empty(BetterStack<T> stack) {
		while(!stack.isEmpty()) {
			stack.pop();
		}
	}
	
	public static BetterStack getReversed(BetterStack original) {
		BetterStack reversed = new BetterStack(-1);
		while(!original.isEmpty()) {
			reversed.push(original.pop());
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		BetterStack<Apple> gs1 = new BetterStack<Apple>(-1);
		for(int i = 0; i < 5; i++) {
			gs1.push(new Apple(i));
		}
		StackUtil.printStack(gs1);
		printStack(gs1);
	}
}