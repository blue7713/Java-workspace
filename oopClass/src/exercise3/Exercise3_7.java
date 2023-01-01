package exercise3;

public class Exercise3_7 {
	public static void main(String[] args) {
		int number[] = new int[10]; //10개짜리 배열 생성
		double sum = 0; // 평균구하기
		
		System.out.print("랜덤한 정수들 : ");
		for(int i = 0; i < number.length; i++) {
			number[i] =(int)(Math.random()*10) + 1; //배열에 1~10까지의 랜덤 정수 할당
			System.out.print(number[i] + " ");
		}
		System.out.println(); //줄 바꾸기
		
		for(int i = 0; i < number.length; i++) { //평균 구하기
			sum += number[i];
		}
		System.out.println("평균은 " + sum/10);
	}
}