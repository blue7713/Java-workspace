package exercise2;
import java.util.Scanner;

public class Exercise2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("금액을 입력하시오>>");
		int money = scanner.nextInt();
		int 오만원 = money / 50000;
		if(오만원 > 0) {
			System.out.println("오만원권:" + 오만원 + "매");
		}
		int 만원 = (money%50000) / 10000;
		if(만원 > 0)
			System.out.println("만원권:" + 만원 + "매");
		
		int 천원 = ((money%50000)%10000) / 1000;
		if(천원 > 0)
			System.out.println("천원권:" + 천원 + "매");
		
		int 백원 = (((money%50000)%10000)%1000) / 100;
		if(백원 > 0)
			System.out.println("백원:" + 백원 + "개");
		
		int 십원 = ((((money%50000)%10000)%1000)%100) / 10;
		if(십원 > 0)
			System.out.println("십원:" + 십원 + "개");
		
		int 일원 = (((((money%50000)%10000)%1000)%100)%10) / 1;
		if(일원 > 0)
			System.out.println("일원:" + 일원 + "개");
		
		scanner.close();
	}
}