package org.example.backtracking;

/*
 * 피로도
 * */

public class Backtracking_003 {

    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80,20},{50,40},{30,10}}));

    }

    private static int answer = -1;

    private static int solution(int k, int[][] dungeons) {

        boolean[] visited = new boolean[dungeons.length];

        backtrack(k, dungeons, visited, 0);

        return answer;
    }

    private static void backtrack(int k, int[][] dungeons, boolean[] visited, int count) {

        if (count > answer) {
            answer = count;
        }

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                count++;
                visited[i] = true;
                k = k - dungeons[i][1];
                backtrack(k, dungeons, visited, count);
                count--;
                k = k + dungeons[i][1];
                visited[i] = false;
            }
        }
    }
}
