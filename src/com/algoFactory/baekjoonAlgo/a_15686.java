package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class a_15686 {

    static int ans = Integer.MAX_VALUE;
    static List<place> placeList;
    static List<place> userList;
    static List<place> selectedPlaceList;
    static int N,M;

    static class place{
        int first,second;

        public place(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }


    private static void dfs(int startPosition, int cnt) {
        if (cnt == M){
            calc();
            return ;
        }

        for (int i = startPosition+1; i < placeList.size(); i++) {
            place p = placeList.get(i);
            selectedPlaceList.add(p);
            dfs(i,cnt+1);
            selectedPlaceList.remove(p);
        }
    }

    private static void calc() {
        int temp=0;
        for(place app : userList){
            int value = Integer.MAX_VALUE;
            for (place p : selectedPlaceList){
                value = Math.min(value, Math.abs(app.first - p.first) + Math.abs(app.second - p.second));
            }
            temp+=value;
        }
        ans = Math.min(temp,ans);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        placeList = new ArrayList<>();
        userList = new ArrayList<>();
        selectedPlaceList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <N ; j++) {
                int V = Integer.parseInt(st.nextToken());
                if (V == 1)
                    userList.add(new place(i,j));
                else if (V==2)
                    placeList.add(new place(i,j));
            }
        }
        int cnt=0;

        for (int i = 0; i <placeList.size() ; i++) {
            place p = placeList.get(i);
            selectedPlaceList.add(p);
            dfs(i,cnt+1);
            selectedPlaceList.remove(p);
        }
        System.out.println(ans);
    }
}
