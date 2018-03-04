import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class a_11399 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int []arr = new int[N];
		int []C = new int [N];
		int res =0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		C[0] = arr[0];
		res += arr[0];
		for (int i=1;i<N;i++){
			C[i] = arr[i] + C[i-1];
			res+=C[i];
		}
		System.out.println(res);
	}

}
