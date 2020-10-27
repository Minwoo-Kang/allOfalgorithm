package com.algoFactory.Programmers;

import java.util.Arrays;
import java.util.StringTokenizer;

public class NSolution3 {
    public static String[] solution(String[] record){
        String[] answer ={};


        final String RECEIVE = "RECEIVE";
        final String DELETE = "DELETE";
        final String SAVE = "SAVE";

        String[] testMailBox = new String[10000];
        String[] permMailBox = new String[10000];
        int permIdx = 0;

        int last = 0;

        for (int keywordIdx = 0; keywordIdx < record.length; keywordIdx++) {
            StringTokenizer st = new StringTokenizer(record[keywordIdx]);
            String operation = st.nextToken();
            if (operation.equals(RECEIVE)){
                String email = st.nextToken();
                testMailBox[last++] = email;
            }
            else if (operation.equals(DELETE)){
                last--;
            }else if (operation.equals(SAVE)){
                for (int i = 0; i < last; i++) {
                    permMailBox[permIdx++] = testMailBox[i];
                }
                last = 0;
            }
        }

        answer = new String[permIdx];
        for (int i = 0; i < permIdx; i++) {
            answer[i] = permMailBox[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] input = {"RECEIVE abcd@naver.com", "RECEIVE zzkn@naver.com", "DELETE", "RECEIVE qwerty@naver.com", "SAVE", "RECEIVE QwerTY@naver.com"};
        System.out.println(Arrays.toString(solution(input)));
    }
}
