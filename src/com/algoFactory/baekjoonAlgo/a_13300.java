

import java.io.*;
import java.util.StringTokenizer;

public class a_13300 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int g = 0;
		int s = 0;
		int result = 0;
		
		int []m = new int[6];
		int []w = new int[6];
		
		for (int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine()," ");
			s = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			if(s==0) m[g-1]++;
			else w[g-1]++;
		}
		
		for (int i=0;i<6;i++){
			result += m[i]/K + w[i]/K;
			if(m[i]%K !=0) result++;
			if(w[i]%K !=0) result++;
		}
		System.out.println(result);
	}

}
