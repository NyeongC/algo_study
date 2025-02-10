package org.example.sorting;

/*
가장 큰 수

* */

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorting007 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }

    public static String solution(int[] numbers) {
        String answer = "";

        String[] arr = Arrays.stream(numbers)
                .mapToObj(String::valueOf).toArray(String[]::new);

        Arrays.sort(arr, (a, b) -> {
            return Integer.compare(
                    Integer.parseInt(b + a), Integer.parseInt(a + b)
            );
        });

        answer = Arrays.stream(arr).collect(Collectors.joining(""));

        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
