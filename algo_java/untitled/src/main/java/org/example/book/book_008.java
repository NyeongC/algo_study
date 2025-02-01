package org.example.book;

import java.util.*;

/*
 *
 *
 * */
public class book_008 {

    public static void main(String[] args) {
        System.out.println((solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}
                ,new String[]{"josipa", "filipa", "marina", "nikola"})));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> hm = new HashMap<>();

        for(String i : participant) {
            hm.put(i,hm.getOrDefault(i,0) + 1);
        }

        for(String i : completion) {
            hm.put(i,hm.get(i) - 1);
        }

        for(String i : hm.keySet()) {
            if(hm.get(i) == 1) {
                answer = i;
            }
        }

        return answer;
    }

}
