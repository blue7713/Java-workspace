package exercise3;

public class Exercise3_11 {

	public static void main(String[] args) {
		// 입력받은 인자가 없다면 출력
		if(args.length == 0) {
			System.out.println("인자를 입력해주세요"); //
		}
		// 인자를 입력받으면 평균값 출력
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			// 문자열을 정수로 변환
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println(sum / args.length);
	}
}