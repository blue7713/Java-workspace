package control.loop.demo;

public class CommandLineArgument {
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("Arguments: ");
		for(int i = 0; i < args.length - 1; i++) {
			System.out.print(args[i] + ", ");
			sum += Integer.parseInt(args[i]); // type conversion(String -> int) and add-up
		}
		System.out.println(args[args.length - 1]);
		sum += Integer.parseInt(args[args.length - 1]); // add-up the last argument.

		System.out.println("Sum = " + sum);
	}
}