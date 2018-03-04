import java.io.*;
import java.util.StringTokenizer;
public class a_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		int max=0;
		int []arr = new int [N];
		int temp;
		int ans=0;
		for (int i=0;i<N;i++){
			temp = Integer.parseInt(br.readLine());
			if(temp<=K){
				max++;
				arr[i] = temp;
			}else break;
		}
		for(int i=max-1;i>=0;i--){
			if(arr[i]<=K){
				ans+= K/arr[i];
				K %= arr[i];
			}
		}
		System.out.println(ans);
	}

}
