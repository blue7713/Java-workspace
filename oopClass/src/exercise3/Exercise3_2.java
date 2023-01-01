package exercise3;

public class Exercise3_2 {
	public static void main(String[] args) {
		int n[][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
		for(int i = 0; i < n.length; i++) { // 행에 대한 반복
			for(int j = 0; j < n[i].length; j++) { // 열에 대한 반복
				System.out.print(n[i][j] + " ");
			}
			System.out.println(); // 다음 줄로 넘어가기
		}
	}
}