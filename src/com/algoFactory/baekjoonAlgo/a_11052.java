

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a_11052 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int []C = new int[N+1];
		int []d = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i =1;i<=N;i++){
			C[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=N;i++){
			for(int j=i;j<=N;j++){
					if(d[j]<C[i]+d[j-i]) d[j] = C[i]+d[j-i]; 
			}
		}
		System.out.println(d[N]);
	}

}
