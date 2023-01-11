package exercise4;

public class Exercise4_9 {
	class ArrayUtil{
		
		public static int[] concat(int[] a, int[] b) {
			int sum[] = new int[a.length + b.length]; // 받은 크기만큼 객체 배열
			for(int i = 0; i < a.length; i++) {
				sum[i] = a[i];
			}
				
			for(int i = 0; i < b.length; i++) {
				int index = a.length + i;
				sum[index] = b[i];
				}
			return sum;
			}
		
		public static void print(int [] a) {
			System.out.print("[");
			for(int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println("]");
		}
	}
	
	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}