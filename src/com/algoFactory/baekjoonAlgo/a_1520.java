package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.StringTokenizer;
public class a_1520 {
	static int search(int x,int y,int N,int M,int C[][],int map[][]){
		if(x==N && y==M) return 1;
		if(C[x][y]!=-1) return C[x][y]; //-1이 아니면 방문한 곳.
        C[x][y] = 0;    //첫 방문시 경우의 수 초기화.
                        // 이 코드를 통해 다음 지역이 방문을 한 것인지 , 아니면 경우의 수가 없는 길인지 알 수 있다.
		int move_x[] = {0,1,0,-1};
		int move_y[] = {1,0,-1,0};
		for(int i=0;i<4;i++){
			int next_x = x+move_x[i];
			int next_y = y+move_y[i];
			if(next_x>=0 && next_y>=0 && next_x<=N && next_y <=M){
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
		int [][]map = new int[N][M];
		int [][]C = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				C[i][j] = -1;
			}
		}

		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<M;j++) map[i][j]= Integer.parseInt(st.nextToken());
		}
		System.out.println(search(0,0,N-1,M-1,C,map));
	}
}