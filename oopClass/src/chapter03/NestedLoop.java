package chapter03;
public class NestedLoop {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) { // 1단에서 9단
			for(int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t'); // 하나씩 탭으로 띄우기
			}
			System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
		}
	}
}