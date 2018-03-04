import java.io.*;
import java.util.*;

public class a_10942 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(br.readLine());
		int[][] C = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) C[i][i] = 1;	//길이가 1인 palindrome
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j + i <= N; j++) { // i는 거리 , j는 start point
				if (i == 1) {
					if (arr[j + 1] == arr[j]) C[j][j + 1] = 1;
				} else {
					if ((arr[i + j] == arr[j]) && (C[j + 1][i + j - 1] == 1)) C[j][j + i] = 1;
				}
			}
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(C[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]+"\n");
		}
		bw.close();
	}
}
