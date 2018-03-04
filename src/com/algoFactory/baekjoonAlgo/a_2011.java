

import java.io.*;

public class a_2011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int len = sb.length();

		long end_1 = 1;
		if ((Integer.parseInt(sb.substring(0, 1)) == 0) && (len == 1))
			end_1 = 0;
		long end_2 = 0;
		long temp = 0;
		//char[] c_temp = {'0','0'};

		for (int i = 1; i < len; i++) {
			int a = Integer.parseInt(sb.substring(i, i + 1));
			//c_temp[1] = sb.charAt(i);
			int b = Integer.parseInt(sb.substring(i-1, i + 1));
			temp = end_1;
			
			if (a!=0){
				end_1 += end_2;
				if(b>=10 && b<=26) end_2 = temp;
				else if (b>26) end_2 = 0;
			}
			

		}
		System.out.println((end_1 + end_2) % 1000000);
	}

}
