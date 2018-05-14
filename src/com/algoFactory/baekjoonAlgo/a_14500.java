package com.algoFactory.baekjoonAlgo;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class a_14500 {
    static int[][][] tetromino1 = {{{0, 0}, {0, 1}, {0, 2}, {0, 3}}, {{0, 0}, {1, 0}, {2, 0}, {3, 0}}};
    static int[][][] tetromino2 = {{{0, 0}, {0, 1}, {1, 0}, {1, 1}}};
    static int[][][] tetromino3 = {{{0, 0}, {0, 1}, {-1, 0}, {-2, 0}}, {{0, 0}, {0, 1}, {0, 2}, {-1, 2}}, {{0, 0}, {0, 1}, {1, 1}, {2, 1}}, {{0, 0}, {1, 0}, {0, 1}, {0, 2}},{{0, 0}, {0, 1}, {1, 0}, {2, 0}},{{0, 0}, {1, 0}, {1, 1}, {1, 2}},{{0, 0}, {0, 1}, {-1, 1}, {-2, 1}},{{0, 0}, {0, 1}, {0, 2}, {1, 2}}};
    static int[][][] tetromino4 = {{{0, 0}, {1, 0}, {1, 1}, {2, 1}}, {{0, 0}, {0, 1}, {-1, 1}, {-1, 2}},{{0, 0}, {-1, 0}, {-1, 1}, {-2, 1}},{{0, 0}, {0, 1}, {1, 1}, {1, 2}}};
    static int[][][] tetromino5 = {{{0, 0}, {0, 1}, {1, 1}, {0, 2}}, {{0, 0}, {1, 0}, {1, 1}, {2, 0}}, {{0, 0}, {0, 1}, {-1, 1}, {0, 2}}, {{0, 0}, {1, 0}, {1, -1}, {2, 0}}};

    static List<int[][][]> tetrominoList = Arrays.asList(tetromino1, tetromino2, tetromino3, tetromino4, tetromino5);

    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        long maxArea = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                map[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int curX = i;
                int curY = j;
                for (int[][][] tetrominos : tetrominoList) {
                    for (int k = 0; k < tetrominos.length; k++) {
                        if (isValid(tetrominos[k], curX, curY)) {    //one of tetromino == tetrominos[k]
                            long sumArea =0;
                            for (int l = 0; l < 4; l++) {
                                sumArea+=map[tetrominos[k][l][0]+curX][tetrominos[k][l][1]+curY];
                            }
                            if (sumArea>maxArea)
                                maxArea = sumArea;
                        }
                    }
                }
            }
        }

        System.out.println(maxArea);

    }

    private static boolean isValid(int[][] tetromino, int curX, int curY) {
        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            if (tetromino[i][0] + curX >= N  || tetromino[i][0] + curX < 0|| tetromino[i][1] + curY >= M || tetromino[i][1] + curY < 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}