

import java.util.Scanner;

public class a_9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int M = sc.nextInt();
			long[] C = new long[M + 3];
			C[1] = 1;
			C[2] = 2;
			C[3] = 4;
			for (int j = 4; j <= M; j++) {
				C[j] = C[j - 1] + C[j - 2] + C[j - 3];
			}
			System.out.println(C[M]);
		}

	}

}
