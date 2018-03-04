import java.io.*;
import java.util.*;
public class a_9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder input = new StringBuilder(br.readLine());
		StringBuilder comp = new StringBuilder(br.readLine());
		Stack<Character> stk = new Stack<Character>();
		int i_len = input.length();
		int c_len = comp.length();
		boolean is_true =false;
		for(int i=0;i<i_len;i++){
			stk.push(input.charAt(i));
			if(stk.size()>=c_len&&stk.peek() == comp.charAt(c_len-1)){
				is_true = true;
				for(int j=1;j<c_len;j++){	
					if(stk.get(stk.size()-j-1)!=comp.charAt(c_len-j-1)){
						is_true = false;
						break;
					}
				}
			}
			if(is_true){
				for(int j=0;j<c_len;j++) stk.pop();
				is_true = false;
			}	
		}
		StringBuilder sb = new StringBuilder();
		int size = stk.size();
		if(stk.isEmpty()) System.out.println("FRULA");
		else{
			for(int i=0;i<size;i++) sb.append(stk.pop());
			System.out.println(sb.reverse().toString());
		}		
	}
}