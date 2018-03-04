import java.io.*;
import java.util.*;
public class a_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T  = Integer.parseInt(br.readLine());
		StringBuilder sb ;
		Stack stk ;
		int len;
		char temp;
		int flag;
		for(int i=0;i<T;i++){
			flag = 0;
			stk = new Stack();
			sb = new StringBuilder(br.readLine());
			len = sb.length();
			for(int j=0;j<len;j++){
				temp = sb.charAt(j);
				if(temp=='(') stk.push(temp);
				else{
					if(stk.isEmpty()){
						flag = 1;
						break;
					}else stk.pop();
				}
			}
			if(stk.isEmpty() && flag==0) System.out.println("YES");
			else System.out.println("NO");	
		}			
	}
}