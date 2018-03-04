

import java.io.*;
import java.util.StringTokenizer;

public class a_2293 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] d = new int[k + 1];
		d[0] = 1;

		for (int i = 0; i < N; i++) {
			int t = Integer.parseInt(br.readLine());
			for (int j = t; j <= k; j++) d[j]+=d[j-t];
		}
		System.out.println(d[k]);
	}

}
