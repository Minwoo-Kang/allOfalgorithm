import java.io.*;
import java.util.*;
public class a_1010 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int N,M;
		long [][]C;
		StringTokenizer st;
		for(int i=0;i<T;i++){
			long res=0;
			st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			C = new long[N][M];
			for(int j=0;j<M-N+1;j++) C[0][j]=1;
			
			for(int k=1;k<N;k++){
				for(int t=k;t<M-N+k+1;t++){
					for(int u=0;u<t;u++){
						C[k][t]+=C[k-1][u];
					}
				}
			}
			for(int k=0;k<M;k++) res+=C[N-1][k];
			System.out.println(res);
		}

	}

}
