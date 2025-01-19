package org.example.book;

import java.util.*;

public class book_003 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(5,new int []{2, 1, 2, 6, 2, 4, 3, 3})));
    }

    public static int[] solution(int N, int[] stages) {

        int total = stages.length;

        int [] challenge = new int[N+2];

        for(int i=0; i<total; i++) {
            challenge[stages[i]] += 1;
        }

        Map<Integer, Double> hm = new HashMap<>();

        for(int i=1; i<=N; i++) {
            if(challenge[i] == 0){
                hm.put(i, 0.);
            } else {
                hm.put(i, challenge[i] / (double)total);
                total -= challenge[i];
            }
        }

        return hm.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(HashMap.Entry::getKey).toArray();
    }

}
