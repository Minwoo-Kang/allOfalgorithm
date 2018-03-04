

import java.io.*;

public class a_2193 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long bit_0 = 0;
		long bit_1 = 1;
		long temp = 0;
		for (int i = 1;i<N;i++){
			temp = bit_0;
			bit_0 = bit_0 + bit_1;
			bit_1 = temp;
		}
		System.out.println(bit_0+bit_1);
	}

}
