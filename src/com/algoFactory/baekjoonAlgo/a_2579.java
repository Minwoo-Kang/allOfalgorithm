

import java.util.Scanner;

public class a_2579 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] C = new int[N + 1][3];
		C[1][1] = sc.nextInt();
		for (int i = 2; i <= N; i++) {
			int v = sc.nextInt();
			C[i][1] = Math.max(C[i-2][1], C[i-2][2]) + v;
			C[i][2] = C[i-1][1] + v;
			
		}

		System.out.println(Math.max(C[N][1], C[N][2]));
	}

}
