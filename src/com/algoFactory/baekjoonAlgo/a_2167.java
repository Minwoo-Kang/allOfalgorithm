
import java.io.*;
import java.util.*;
public class a_2167 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][]C = new int[N+1][M+1];
		for(int i=1;i<=N;i++){
			st = new StringTokenizer(br.readLine()," ");
			C[i][0] = C[i-1][M];
			for(int j=1;j<=M;j++){
				C[i][j] = Integer.parseInt(st.nextToken()) + C[i][j-1];
			}
		}
		int T = Integer.parseInt(br.readLine());
		for (int k=0;k<T;k++){
			st = new StringTokenizer(br.readLine()," ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int sum = 0;
			for (int t = i;t<=x;t++) sum+=C[t][y] - C[t][j-1];
			System.out.println(sum);
		}

	}

}
