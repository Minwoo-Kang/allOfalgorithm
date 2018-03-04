import java.io.*;
import java.util.StringTokenizer;
public class a_1932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int [N][N+1];
		int[][] C = new int [N][N+1];
		StringTokenizer st;
		int ans = 0;
		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j=1;j<=i+1;j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		C[0][1] = arr[0][1];
		for(int i=1;i<N;i++){
			for(int j=1;j<=i+1;j++) C[i][j] = Math.max(C[i-1][j-1],C[i-1][j]) + arr[i][j];
		}
		for(int i=1;i<=N;i++) ans = Math.max(C[N-1][i], ans);
		System.out.println(ans);
		
	}
}