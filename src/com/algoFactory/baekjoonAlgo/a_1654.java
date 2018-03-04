

import java.util.Scanner;

public class a_1654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long max = 1;
		long min = 1;
		long result = 1;

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		long N = sc.nextLong();

		long line[] = new long[K];

		for (int i = 0; i < K; i++) {
			line[i] =sc.nextLong();
			max = Math.max(max, line[i]);
		}//입력 완료

		while ( min<=max) {
			long mid = (max + min) / 2;
			long cnt = 0;

			for (int j = 0; j < K; j++) {
				cnt += line[j] / mid;
			}
			if (cnt < N) {
				max = mid-1;
			} else{
				result= Math.max(result, mid);
				min = mid+1;
			} 
		}
		System.out.println(result);

	}

}
