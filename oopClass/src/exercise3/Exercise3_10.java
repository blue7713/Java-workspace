package exercise3;

public class Exercise3_10 {
public static void main(String [] args) {
		
		int count=1;
		int n1, n2;
		
		int array[][] = new int[4][4]; // 4*4의 2차원 배열 생성  
		
		for(int i=0; i<array.length; i++) { // 배열에 랜덤한 정수 할당
			for(int j=0; j<array[i].length; j++) { 
				array[i][j] = (int)(Math.random()*10+1);
			}
		}
			 
		while(count<7) { // 그 중 6개의 수를 랜덤으로 0으로 만들기
			n1 =  (int)(Math.random() * 3);  // 4*4 배열이기 때문에 0~3까지
			n2 =  (int)(Math.random() * 3); 
			
			if(array[n1][n2] != 0) {
				array[n1][n2] = 0;
				count++;
			}
		}		
		
		for(int i=0; i<array.length; i++) { // 배열 출력
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println(" "); 
		}		
	}
}