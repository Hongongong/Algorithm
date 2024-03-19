import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 행렬 크기 N
		int M = sc.nextInt(); // 행렬 크기 M
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] sum = new int[N][M];
		
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				A[i][j] = sc.nextInt();
				sum[i][j] += A[i][j];
			}
		}
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < B[i].length; j++) {
				B[i][j] = sc.nextInt();
				sum[i][j] += B[i][j];
			}
		}
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum[i].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}