import java.io.*;
import java.util.Arrays;
public class a_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int[] arr = new int[26];
		//Arrays.fill(arr, -1);
		int len = sb.length();
		int temp;
		for(int i=0;i<len;i++) arr[sb.charAt(i)-'a']++;
		sb = new StringBuilder();
		for(int i=0;i<26;i++) sb.append(arr[i]+ " ");
		System.out.println(sb.toString());
	}
}