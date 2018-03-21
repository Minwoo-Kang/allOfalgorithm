package com.algoFactory.baekjoonAlgo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_1912 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int max = -1001;
		int sum = 0;

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		while(st.hasMoreTokens()){
			sum += Integer.parseInt(st.nextToken());
			if (sum > max) max = sum;
			if (sum<0) sum = 0;
		}
		System.out.println(max);
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = -1001;
		int sum = 0;
		for(int i =0;i<N;i++){
			sum += sc.nextInt();
			if(sum>max)max=sum;
			if(sum<0)sum=0;	//sum�ʱ�ȭ
		}
		System.out.println(max);*/
	}

}
