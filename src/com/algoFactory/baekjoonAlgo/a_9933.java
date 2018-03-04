import java.io.*;
public class a_9933 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder[] sb = new StringBuilder[N];
		for(int i=0;i<N;i++){
			sb[i] = new StringBuilder(br.readLine());
		}
		for(int i=0;i<N;i++){
			for(int j=i;j<N;j++){
				if(sb[i].toString().equals(sb[j].reverse().toString())){
					System.out.println(sb[i].length() + " " + sb[i].charAt(sb[i].length()/2));
					break;
				}
			}
		}
	}
}