package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 네트워크
 * */
public class Solve_016 {

    public static void main(String[] args) throws IOException {
        System.out.println(solution(6, new int[][]{
                {1,1,0,0,0,0},
                {1,1,0,0,0,0},
                {0,0,1,0,0,0},
                {0,0,0,1,1,0},
                {0,0,0,1,1,0},
                {0,0,0,0,0,1}
        }));

    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if(computers[i][i] == 1) {
                dfs(i, computers);
                answer++;
            }
        }

        return answer;

    }

    public static void dfs(int v, int[][] computers) {

        computers[v][v] = 2;

        int[] computer = new int[computers[v].length];

        for (int i = 0; i < computers[v].length; i++) {
            computer[i] = computers[v][i];
        }

        for (int i = 0; i < computer.length; i++) {
            if (computer[i] == 1 && computers[i][i] == 1) {
                dfs(i, computers);
            }
        }

    }
}
