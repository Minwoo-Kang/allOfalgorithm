

import java.io.*;
public class a_11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer(br.readLine());
		long sum=0;
		for(int i =0;i<N;i++) sum+= (int)sb.charAt(i)-'0';
		System.out.println(sum);
	}

}
