import java.io.*;
import java.util.*;
public class a_10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int len = sb.length();
		Stack<Integer> stk = new Stack();
		char temp;
		int p;
		int ans=0;
		for(int i=0;i<len;i++){
			temp = sb.charAt(i);
			if(temp=='(') stk.push(i);
			else{
				p=stk.pop();
				if(i-p==1) ans+=stk.size();
				else ans++;
			}
		}
		System.out.println(ans);
	}
}