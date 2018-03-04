
import java.io.*;
public class a_11655 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		int len = sb.length();
		char c = ' ';
		int res = 0;
		for(int i=0;i<len;i++){
			c = sb.charAt(i);
			res = c-'A';
			if(res>=0 && res<=25) sb.append((char)((res+13)%26+65));
			else if(res>=32 && res<=57) sb.append((char)((c-'a'+13)%26+97));
			else sb.append(c);
		}
		System.out.println(sb.substring(len).toString());
	}
}
