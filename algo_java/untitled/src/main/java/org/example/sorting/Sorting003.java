package org.example.sorting;

/*
문자열 내 마음대로 정렬하기
* */

import java.util.Arrays;

public class Sorting003 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 2)));
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> a.charAt(n) == b.charAt(n) ?
                a.compareTo(b) : Character.compare(
                a.charAt(n), b.charAt(n)));
        return strings;
    }
}
