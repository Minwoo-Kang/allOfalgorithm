

import java.io.*;

public class a_11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		while (N != 1) {
			for (int i = 2; i <= N; i++) {
				if ((N % i) == 0) {
					N /= i;
					System.out.println(i);
					break;
				}
			}
		}
	}
}
