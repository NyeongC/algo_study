package org.example.backtracking;

/*
 * 피로도
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_006 {

    public static void main(String[] args) {
        System.out.println(solution(80, new int[][] {{80,20},{50,40},{30,10}}));
    }

    static int answer = -1;
    public static int solution(int k, int[][] dungeons) {

        boolean[] visited = new boolean[dungeons.length];

        backtrack(k, dungeons, visited, 0);


        return answer;
    }

    static void backtrack(int k, int[][] dungeons, boolean[] visited, int count) {

        if (count > answer) {
            answer = count;
        }

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && k - dungeons[i][0] >= 0) {
                count++;
                visited[i] = true;
                k = k - dungeons[i][1];
                backtrack(k, dungeons, visited, count);
                count--;
                visited[i] = false;
                k = k + dungeons[i][1];
            }
        }


    }
}