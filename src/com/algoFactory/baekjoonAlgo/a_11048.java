import java.io.*;
import java.util.StringTokenizer;
public class a_11048 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][] map = new int [N+1][M+1];
		long [][] C = new long[N+1][M+1];
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=1;j<=M;j++) map[i][j] = Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=N;i++){
			for(int j=1;j<=M;j++) C[i][j] = Math.max(C[i-1][j], Math.max(C[i][j-1],C[i-1][j-1]))+map[i][j];
		}
		System.out.println(C[N][M]);
	}
}
