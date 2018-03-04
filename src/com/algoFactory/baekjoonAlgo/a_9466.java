import java.io.*;
import java.util.*;
public class a_9466 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int n;//2 = complete , 1 = working , 0 = not yet
		int []student;
		int []check;
		StringTokenizer st;
		Stack stk = new Stack<Integer>();
		for(int i=0;i<T;i++){
			n = Integer.parseInt(br.readLine());
			student = new int[n+1];
			check = new int[n+1];
			st = new StringTokenizer(br.readLine()," ");
			for(int j=1;j<=n;j++) student[j] = Integer.parseInt(st.nextToken());
			
			for(int j=1;j<=n;j++){
				if(check[j]!=2){
					int indx;
					check[j] = 1;
					stk.push(j);
					
					while(check[student[j]]!=2 || check[student[j]]!=1){
						indx = student[j];
						//stk.push
					}
					
				}
			}
		}
	}
}