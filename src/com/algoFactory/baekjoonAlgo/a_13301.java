

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a_13301 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long n = 1;
		long n_1 = 0;
		long temp = 0;
		
		for(int i = 1; i<N;i++){
			temp = n;
			n += n_1;
			n_1 = temp;
		}
		System.out.println(4*n + 2*n_1);
	}

}
