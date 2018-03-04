import java.io.*;
import java.util.StringTokenizer;
public class a_10824 {
	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder(st.nextToken()+st.nextToken());
		int a = Integer.parseInt(sb.toString());
		sb = new StringBuilder(st.nextToken()+st.nextToken());
		int b = Integer.parseInt(sb.toString());
		System.out.println(a+b);
		
	}

}
