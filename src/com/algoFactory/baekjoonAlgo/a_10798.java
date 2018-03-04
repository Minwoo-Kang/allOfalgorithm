import java.io.*;
public class a_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] arr = new char[5][15];
		StringBuilder sb;
		int len;
		for(int i=0;i<5;i++){
			sb = new StringBuilder(br.readLine());
			len = sb.length();
			for(int j=0;j<len;j++) arr[i][j] = sb.charAt(j);
		}
		sb = new StringBuilder();
		for(int i=0;i<15;i++){
			for(int j=0;j<5;j++){
				if(arr[j][i]!='\0') sb.append(arr[j][i]);
			}
		}
		System.out.println(sb.toString());
	}
}