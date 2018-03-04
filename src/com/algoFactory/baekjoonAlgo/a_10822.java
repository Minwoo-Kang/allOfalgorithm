import java.io.*;
import java.util.StringTokenizer;
public class a_10822 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine(),",");
		long res =0;
		while(st.hasMoreTokens()) res+=Integer.parseInt(st.nextToken());
		System.out.println(res);
	}
}
