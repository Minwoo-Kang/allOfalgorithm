import java.io.*;
import java.util.StringTokenizer;
public class a_10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int H,W,N;
		for(int i=0;i<T;i++){
			st = new StringTokenizer(br.readLine(), " ");
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			System.out.println(( (N%H!=0)? String.valueOf(N%H):String.valueOf(H))  +  ((((N-1)/H)+1<=9)? "0"+String.valueOf(((N-1)/H)+1):String.valueOf(((N-1)/H)+1)));
		}
	}
}