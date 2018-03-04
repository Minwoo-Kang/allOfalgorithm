import java.io.*;
import java.util.*;
public class a_1260 {
	
	static void dfs(int [][]map,int start,int check[]){
		check[start] = 1;
		System.out.print(start+" ");
		for(int i=1;i<map[start].length;i++){
			if(map[start][i]==1 && check[i]!=1) dfs(map,i,check);
		}
	}
	static void bfs(int [][]map,int start,int check[]){
		int []q = new int[check.length];
		int front = 0;
		int end = 0;
		q[end++] = start;
		int v;
		while(front<end){
			v = q[front++];
			check[v]=1;
			System.out.print(v+" ");
			for(int i=0;i<check.length;i++) {
				if(check[i]!=1 && map[v][i]==1) {
					q[end++] = i;
					check[i] =1;
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int [][]map = new int[N+1][N+1];
		int check[] = new int[N+1];
		
		for(int i=0;i<M;i++){
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b]=1;
			map[b][a]=1;
			
		}
		dfs(map,V,check);
		System.out.println();
		Arrays.fill(check, 0);
		bfs(map,V,check);

	}
	
}