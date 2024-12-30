package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;

/*
 * 덧칠하기
 * */
public class Solve_012 {

    public static void main(String[] args) throws IOException {
        System.out.println(solution(8, 4, new int[] {2,3,6}));
    
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int d = 0;
        for(int i : section) {
            if(d < i) {
                d = i + m - 1;
                answer++;
            }
        }
        return answer;
    }
}
