import java.io.*;
import java.util.*;
public class a_11652 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N];
		int cnt=0;
		int res=1;
		long ans=0;
		for(int i=0;i<N;i++) arr[i] = Long.parseLong(br.readLine());
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		long temp=arr[0];
		for(int i=0;i<N;i++){
			if(arr[i]==temp){
				cnt++;
				if(cnt>res) {
					ans = arr[i];
					res=cnt;
				}
			}else{
				temp=arr[i];
				cnt=1;
			} 
		}
		System.out.println(ans);
	}
}
