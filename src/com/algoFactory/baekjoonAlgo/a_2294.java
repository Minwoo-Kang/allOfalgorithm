import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class a_2294 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] d = new int[K+1];
		Arrays.fill(d,-1);
		d[0] = 0;
		int t;
		for (int i = 0; i < N; i++) {
			t = Integer.parseInt(br.readLine());
			if (t <= K) {
				d[t] = 1;
				for (int j = t+1; j <= K; j++) {
					if(d[j-t]!=-1){
						if(d[j]==-1) d[j] = d[j-t]+1;
						if(d[j-t]+1<d[j]) d[j] = d[j-t]+1;
					}
				}
				System.out.println(Arrays.toString(d));
			}
		}
		System.out.println(d[K]);
	}
}