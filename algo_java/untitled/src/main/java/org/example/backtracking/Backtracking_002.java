package org.example.backtracking;

import java.util.ArrayList;

/*
* P.463 1부터 N까지 합이 10이 되는 조합 구하기
* */

public class Backtracking_002 {
    static int n;
    static ArrayList<ArrayList<Integer>> result;

    public static void main(String[] args) {
        System.out.println(solution(10));

    }

    public static ArrayList<ArrayList<Integer>> solution(int N) {
        n = N;
        result = new ArrayList<>();

        backtrack(1, 0, new ArrayList<>());

        return result;
    }

    static void backtrack(int start, int sum, ArrayList<Integer> selected) {
        if (sum == 10) {
            result.add(selected);
            return;
        }

        for (int i = start; i <= n; i++) {

            if (i + sum <= 10) {
                ArrayList<Integer> temp = new ArrayList<>(selected);
                temp.add(i);
                backtrack(i + 1, sum + i, temp);
            }
        }


    }


}
