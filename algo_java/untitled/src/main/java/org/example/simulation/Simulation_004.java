package org.example.simulation;

/*
이진 변환 반복하기
* */

import java.util.Arrays;

public class Simulation_004 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];
        answer[0] = answer[1] = 0;

        while(!s.equals("1")) {
            // 0 제거
            String temp = s.replaceAll("0", "");

            // answer 값 추가
            answer[1] += s.length() - temp.length();
            answer[0] += 1;

            // 문자열의 길이를 이진수로 변환
            s = Integer.toBinaryString(temp.length());
        }

        return answer;
    }
}
