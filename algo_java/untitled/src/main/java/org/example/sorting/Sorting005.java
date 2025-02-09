package org.example.sorting;

/*
정수 내림차순으로 배치하기
* */

import java.util.Arrays;
import java.util.Collections;

public class Sorting005 {

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        String[] arr = String.valueOf(n).split("");

        StringBuilder sb = new StringBuilder();

        Arrays.sort(arr, Collections.reverseOrder());

        for(String s : arr) {
            sb.append(s);
        }

        return Long.parseLong(sb.toString());
    }
}
