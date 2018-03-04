import java.io.*;
import java.util.Arrays;
public class a_10610 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int len = sb.length();
		int []arr = new int[len];
		int temp = 0;
		for(int i=0;i<len;i++){
			arr[i] = (int)(sb.charAt(i)-'0');
			temp += arr[i];
		}
		Arrays.sort(arr);
		sb = new StringBuilder();
		if((arr[0]!=0) || (temp%3!=0)){
			System.out.println(-1);
		}else{
			for(int i=len-1;i>=0;i--) sb.append(arr[i]); 
			System.out.println(sb.toString());
		}
		
	}
}