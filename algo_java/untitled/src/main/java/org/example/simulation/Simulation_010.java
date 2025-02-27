package org.example.simulation;

/*
유연근무제
* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Simulation_010 {

    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}}
                , 1, 1));
    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;

        int[] dh = {1, -1, 0, 0};
        int[] dw = {0, 0, 1, -1};

        for (int i = 0; i < 4; i++) {
            int nh = dh[i] + h;
            int nw = dw[i] + w;

            if (nh < 0 || nh > board.length - 1 || nw < 0 || nw > board.length - 1)
                continue;

            if (board[h][w].equals(board[nh][nw]))
                answer++;


        }


        return answer;
    }
}
