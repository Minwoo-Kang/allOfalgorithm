
import java.io.*;
public class a_11762 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long N = 1;
		long N_1 =1;
		long temp = 0;
		for (int i =1;i<n;i++){
			temp = N;
			N += (N_1%10007);
			N_1 = temp % 10007;
		}
		if (n ==1) System.out.println(1);
		else System.out.println(N%10007);
	}
}
