import java.io.*;
import java.util.StringTokenizer;
public class a_11005 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		long N = Long.parseLong(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		long temp =0;
		
		while(N>=B){
			temp = N%B;
			if(temp>=10) sb.insert(0, (char)((temp-10)+'A'));
			else sb.insert(0, (char)(temp+'0'));
			N/=B;
		}
		if(N>=10) sb.insert(0, (char)((N-10)+'A'));
		else sb.insert(0, (char)(N+'0'));

		System.out.println(sb.toString());
		
	}

}
