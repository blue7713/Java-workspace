package control.loop.demo;

public class VariableArgument {
	static void printArray(Object[] args) {
		for(Object o : args) {
			System.out.print(o + " ");
		}
		System.out.println('.');
	}
	static void printAgain(Object... args) {
		for(Object o : args) {
			System.out.print(o + " ");
		}
		System.out.println('.');
	}
	
	public static void main(String[] args) {
		Object[] test1 = {new String("OK?"), new Integer(34), new VariableArgument()};
		String[] test2 = {"go", "don't go"}; // new String[]{"go","don't go"}
		
	//	printArray(); //error! object�� �迭�� �ݵ�� ���ڰ� �־����
		printArray(test1);
		printArray(test2);
		
		printAgain(); // variable argument�� ���ڰ� ��� �������
		printAgain(test1);
		printAgain(test2);
	}
}