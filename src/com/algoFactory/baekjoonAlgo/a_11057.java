import java.io.*;
public class a_11057 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [][]C = new int[N][10];
		int ans = 0;
		for (int i=0;i<10;i++) C[0][i] = 1;
		
		for(int i=1;i<N;i++){
			for(int j=0;j<10;j++){
				for(int k=j;k<10;k++) C[i][j] +=C[i-1][k]%10007;
			}
		}
		for(int i=0;i<10;i++) ans+=C[N-1][i]%10007;
		System.out.println(ans%10007);
	}

}
