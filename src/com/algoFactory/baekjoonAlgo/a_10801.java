import java.io.*;
import java.util.StringTokenizer;
public class a_10801 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		int ans=0;
		int d=0;
		int a =0;
		int b =0;
		while(st1.hasMoreTokens()){
			a = Integer.parseInt(st1.nextToken());
			b = Integer.parseInt(st2.nextToken());
			if(a>b) ans++;
			else if(a==b);
			else ans--;
		}
		if(ans>0) System.out.println("A");
		else if(ans<0) System.out.println("B");
		else System.out.println("D");
	}
}