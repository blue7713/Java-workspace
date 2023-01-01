package exercise3;

public class Exercise3_12 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("인자를 입력해 주세요");
		}
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			try {
				// 인자를 정수로 변환
				int n = Integer.parseInt(args[i]);
				sum = sum + n;
			}
			 // 정수로 변환할 수 없는 인자는 NumberFormatException 예외가 발생하며 합산에서 제외
			catch(NumberFormatException e){
			}
		}
		System.out.print(sum);
	}
}