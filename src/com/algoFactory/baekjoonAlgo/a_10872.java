import java.io.*;
public class a_10872 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		long result =1;
		for (int i=N;i>=1;i--) result*=i;
		bw.write(String.valueOf(result));
		bw.close();
	}
}
