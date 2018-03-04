

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_9461 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long[] C = new long[101];
		C[1] = 1;
		C[2] = 1;
		C[3] = 1;
		C[4] = 2;
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			if (C[N] == 0) {
				for (int j = 5; j <= N; j++) {
					C[j] = C[j - 1] + C[j - 5];
				}
			}
			System.out.println(C[N]);
		}
	}

}
