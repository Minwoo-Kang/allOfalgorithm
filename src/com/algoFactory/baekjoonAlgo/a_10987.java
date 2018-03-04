import java.io.*;
public class a_10987 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int ans=0;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)=='a' ||sb.charAt(i)=='e' ||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u') ans++;
		}
		System.out.println(ans);
	}
}
