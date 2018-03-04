import java.io.*;
import java.util.*;

public class a_11053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// int []arr = new int[N];
		// int []C = new int[N];
		// C[0]=1;
		int[] arr = new int[N];
		int len = 0;
		int temp;

		// int ans=1;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// for (int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
		arr[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			temp = Integer.parseInt(st.nextToken());
			if (arr[len] != temp) {
				if (arr[len] < temp)
					arr[++len] = temp;
				else {
					int lo = 0;
					int hi = len;
					while (lo <= hi) {
						int mid = (lo + hi) / 2;
						if (temp <= arr[mid])
							hi = mid - 1;
						else
							lo = mid + 1;
						arr[lo] = temp;
					}
				}

			}
		}
		System.out.println(len+1);
		/*
		 * O(n^2) for(int i=1;i<N;i++){ temp = arr[i]; for(int j=0;j<i;j++){
		 * if(temp>arr[j] && C[j]+1>=C[i]){ C[i] = C[j]+1; } } if(C[i]==0)
		 * C[i]=1; System.out.println(Arrays.toString(C)); if(ans<C[i])
		 * ans=C[i]; } System.out.println(ans);
		 */
	}

}
