package type.conversion.demo;

public class CommandLineArgument {
	public static void main(String[] args) {
		System.out.println("Arguments: " + args[0] + "," + args[1]);
		
		// type conversion: String -> int
		int firstInteger = Integer.parseInt(args[0]);
		int secondInteger = Integer.parseInt(args[1]);
		
		int sum = firstInteger + secondInteger;
		System.out.println("Sum = " + sum);
	}
}