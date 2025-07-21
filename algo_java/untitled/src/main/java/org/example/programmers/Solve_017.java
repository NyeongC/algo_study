package org.example.programmers;

import java.io.IOException;

/*
 * 정수 삼각형
 * */
public class Solve_017 {

    public static void main(String[] args) throws IOException {
        System.out.println(solution(new int[][]{
                {7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}
        }));

    }

    public static int solution(int[][] triangle) {

        int n = triangle.length;

        for (int i = n -2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }

        }

        return triangle[0][0];
    }
}

/*
class Solution {
    int answer = 0;
    public int solution(int[][] triangle) {


        dfs(0, 0, 0, triangle);

        return answer;
    }

    void dfs(int x, int y, int sum, int[][] triangle) {
        int num = triangle[x][y];
        sum += num;
        answer = Math.max(sum, answer);

        if (x == triangle.length - 1)
            return;

        for (int i = 0; i < 2; i++) {
            dfs(x + 1, y + i, sum, triangle);
        }
    }
}
* */
