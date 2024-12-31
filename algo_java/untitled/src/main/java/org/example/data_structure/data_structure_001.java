package org.example.data_structure;

import java.util.*;

public class data_structure_001 {

    /*
    * ArrayList 사용법
    * remove, min, size 등
    *
    * */

    public int[] solution(int k, int[] score) {
        int n = score.length;
        int[] answer = new int[n];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            list.add(score[i]);

            if (list.size() > k) {
                list.remove(Collections.min(list));
            }


            answer[i] = Collections.min(list);
        }

        return answer;
    }

}
