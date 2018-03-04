

import java.io.*;

public class a_11727 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long N = 3;
		long N_1 = 1;
		long temp = 0;
		for(int i=2;i<n;i++){
			temp = N;
			N += (2*N_1)%10007;
			N_1 = temp%10007;
		}
		if (n==1) System.out.println(1);
		else System.out.println(N%10007);
	}
}
