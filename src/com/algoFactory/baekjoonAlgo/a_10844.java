import java.io.*;
public class a_10844 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int res = 0;
		long [][]C = new long[N][10];
		for(int i=1;i<10;i++) C[0][i] = 1;
		for(int i=1;i<N;i++){
			C[i][0] = C[i-1][1];
			for(int j=1;j<9;j++) C[i][j] = (C[i-1][j-1] + C[i-1][j+1])%1000000000;
			C[i][9] = C[i-1][8];
		}
		for(int i=0;i<10;i++) res+= C[N-1][i];
		System.out.println(res);

	}

}
