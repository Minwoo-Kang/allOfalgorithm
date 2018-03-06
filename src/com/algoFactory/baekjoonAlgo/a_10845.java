package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.StringTokenizer;
class queue {
	int[] list;
	int start;
	int end;
	queue(){
		this.list = new int[10000];
		this.start = 0;
		this.end = 0;
	}
	public void push(int x){
		this.list[end++] = x;
	}
	public int pop(){
		if (start==end) return -1;
		else return this.list[start++];
	}
	public int size(){
		return end-start;
	}
	public int empty(){
		if (start==end) return 1;
		else return 0;
	}
	public int front(){
		if (start==end) return -1;
		else return this.list[start];
	}
	public int back(){
		if(start==end) return -1;
		else return this.list[end-1];
	}
}

public class a_10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String sb;
		int x;
		queue q = new queue();
		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine());
			sb = new String(st.nextToken());
			switch (sb){
				case "push":
					q.push(Integer.parseInt(st.nextToken()));
					break;
				case "front":
					System.out.println(q.front());
					break;
				case "back":
					System.out.println(q.back());
					break;
				case "size":
					System.out.println(q.size());
					break;
				case "empty":
					System.out.println(q.empty());
					break;
				case "pop":
					System.out.println(q.pop());
					break;
			}
		}
	}

}
