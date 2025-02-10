package org.example.sorting;

/*
K번째수
* */

import java.util.Arrays;

public class Sorting006 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}
                , new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int n = 0; n < commands.length; n++) {

            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];

            int[] slicedArr = Arrays.copyOfRange(array, i - 1, j);

            Arrays.sort(slicedArr);

            answer[n] = slicedArr[k - 1];
        }

        return answer;
    }
}
