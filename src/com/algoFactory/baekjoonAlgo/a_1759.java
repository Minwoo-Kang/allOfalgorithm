package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a_1759 {
    static int L,C;
    static int consonant,vowel;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        char[] chars = new char[C];
        int depth =0;
        vowel = 0;
        consonant =0;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++)
            chars[i] = st.nextToken().charAt(0);

        Arrays.sort(chars);

        for (int i = 0; i < C; i++) {
            if (chars[i] == 'a' ||chars[i] == 'i' || chars[i] == 'e' || chars[i] == 'o'  || chars[i] == 'u') {
                vowel++;
            }else
                consonant++;

            sb.append(chars[i]);
            dfs(chars,depth+1,sb,i);
            sb.deleteCharAt(depth);

            if (chars[i] == 'a' ||chars[i] == 'i' || chars[i] == 'e' || chars[i] == 'o'  || chars[i] == 'u')
                vowel--;
            else
                consonant--;
        }
    }

    private static void dfs(char[] chars, int depth, StringBuilder sb,int start) {
        if (depth == L) {
            if (vowel>=1 && consonant >=2)
                System.out.println(sb.toString());
            return;
        }
        for (int i = start+1; i < C; i++) {
            if (chars[i] == 'a' ||chars[i] == 'i' || chars[i] == 'e' || chars[i] == 'o'  || chars[i] == 'u') {
                vowel++;
            }else
                consonant++;

            sb.append(chars[i]);
            dfs(chars, depth+1, sb,i);
            sb.deleteCharAt(depth);

            if (chars[i] == 'a' ||chars[i] == 'i' || chars[i] == 'e' || chars[i] == 'o'  || chars[i] == 'u')
                vowel--;
            else
                consonant--;
        }
    }
}
