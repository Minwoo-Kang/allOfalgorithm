import java.io.*;
import java.util.StringTokenizer;
public class a_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []arr = new int[20000001];
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) arr[Integer.parseInt(st.nextToken())+10000000]++;
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) sb.append(arr[Integer.parseInt(st.nextToken())+10000000]+" ");
		System.out.println(sb.toString());
	}
}