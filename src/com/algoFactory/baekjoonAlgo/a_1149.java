

import java.util.Scanner;

public class a_1149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] cost = new int[3][N];

		final int R = 0;
		final int G = 1;
		final int B = 2;

		cost[R][0] = sc.nextInt();
		cost[G][0] = sc.nextInt();
		cost[B][0] = sc.nextInt();

		for (int i = 1; i < N; i++) {
			int r = sc.nextInt();
			int g = sc.nextInt();
			int b = sc.nextInt();

			cost[R][i] = r + Math.min(cost[G][i - 1], cost[B][i - 1]); // 전까지 파랑
																		// or
																		// 초록을 칠
																		// 한 값중
																		// 가장 작은
																		// 값
			cost[G][i] = g + Math.min(cost[R][i - 1], cost[B][i - 1]);
			cost[B][i] = b + Math.min(cost[R][i - 1], cost[G][i - 1]);
		}
		System.out.println(Math.min(cost[B][N - 1], Math.min(cost[R][N - 1], cost[G][N - 1])));

	}

}
