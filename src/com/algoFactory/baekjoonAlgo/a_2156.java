

import java.io.*;

public class a_2156 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[][] C = new long[N][3];
		C[0][1] = Integer.parseInt(br.readLine());
		for (int i = 1; i < N; i++) {
			int v = Integer.parseInt(br.readLine());
			C[i][0] = Math.max(C[i-1][0], Math.max(C[i-1][1], C[i-1][2]));
			C[i][1] = C[i-1][0] + v;
			C[i][2] = C[i-1][1] + v;
		}
		System.out.println(Math.max(C[N-1][0], Math.max(C[N-1][1], C[N-1][2])));
	}

}
