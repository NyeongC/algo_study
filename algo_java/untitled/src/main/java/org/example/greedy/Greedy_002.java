package org.example.greedy;

import java.util.*;

/*
 * 귤 고르기
 * */

public class Greedy_002 {

    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());

        list.sort(Collections.reverseOrder());

        for (int i : list) {
            if (k - i > 0) {
                answer++;
                k -= i;
            } else {
                answer++;
                break;
            }
        }

        return answer;
    }
}
