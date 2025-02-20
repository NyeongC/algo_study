package org.example.simulation;

/*
연속된 부분 수열의 합

투 포인터임, 꽤나 재밌음, 다시 풀어보기
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Simulation_007 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 7)));
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = {};

        ArrayList<int[]> list = new ArrayList<>();

        int len = sequence.length;
        int left = 0;
        int right = 0;
        int sum = sequence[0];

        while (left < len && right < len) {

            if (k == sum) {
                list.add(new int[]{left, right});
            }

            if (sum <= k) {
                right++;
                if (right < len) {
                    sum += sequence[right];
                }
            } else {
                if (left < len) {
                    sum -= sequence[left];
                }
                left++;
            }


        }

        Collections.sort(list, (a, b) -> Integer.compare(a[1] - a[0], b[1] - b[0]));


        return list.get(0);
    }
}
