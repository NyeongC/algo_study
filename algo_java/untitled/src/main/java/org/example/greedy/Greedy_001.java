package org.example.greedy;

import java.util.Arrays;

/*
 * 구명보트
 * */

public class Greedy_001 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{20, 60, 70, 80, 30}, 100));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int i = 0;
        int j = people.length - 1;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }

            j--;
            answer++;
        }

        return answer;
    }


}
