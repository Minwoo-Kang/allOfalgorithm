import java.io.*;
import java.util.StringTokenizer;
public class a_10804 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		StringTokenizer st;
		int temp;
		for(int i=0;i<10;i++){
			st = new StringTokenizer(br.readLine(), " ");
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			for(int j = s;s<=(s+e)/2;s++){
				temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
				e--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=20;i++) sb.append(arr[i]+" ");
		System.out.println(sb.toString());

	}
}