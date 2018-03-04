import java.io.*;
import java.util.StringTokenizer;
public class a_1520 {
	static int search(int x,int y,int N,int M,int C[][],int map[][]){
		if(x==N && y==M) return 1;
		if(C[x][y]!=0) return C[x][y];
		
		int move_x[] = {0,1,0,-1};
		int move_y[] = {1,0,-1,0};
		for(int i=0;i<4;i++){
			int next_x = x+move_x[i];
			int next_y = y+move_y[i];
			if(next_x>0 && next_y>0 && next_x<=N && next_y <=M){
				if(map[next_x][next_y]<map[x][y]) C[x][y] +=search(next_x,next_y,N,M,C,map);
			}
		}
		return C[x][y];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][]map = new int[N+1][M+1];
		int [][]C = new int[N+1][M+1];
		for(int i=1;i<=N;i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j=1;j<=M;j++) map[i][j]= Integer.parseInt(st.nextToken());
		}
		System.out.println(search(1,1,N,M,C,map));		
	}
}