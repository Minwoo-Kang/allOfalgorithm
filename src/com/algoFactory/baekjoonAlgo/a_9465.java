

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a_9465 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			int[][] V = new int[K][2];
			int[][] d = new int[K][3];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int k = 0;
			while (st.hasMoreTokens()) {
				V[k][0] = Integer.parseInt(st.nextToken());
				k++;
			}
			st = new StringTokenizer(br.readLine(), " ");
			k = 0;
			while (st.hasMoreTokens()) {
				V[k][1] = Integer.parseInt(st.nextToken());
				k++;
			}
			// 입력 완료
			d[0][0] = 0;
			d[0][1] = V[0][0];
			d[0][2] = V[0][1];

			for (int j = 1; j < K; j++) {
				d[j][0] = Math.max(d[j - 1][1], d[j - 1][2]);
				d[j][1] = Math.max(d[j - 1][2], d[j - 1][0]) + V[j][0];
				d[j][2] = Math.max(d[j - 1][1], d[j - 1][0]) + V[j][1];
			}
			System.out.println(Math.max(d[K - 1][1], d[K - 1][2]));
		}

	}

}
