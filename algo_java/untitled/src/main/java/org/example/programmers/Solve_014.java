package org.example.programmers;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 3진법 뒤집기
 * */
public class Solve_014 {

    public static void main(String[] args) throws IOException {
        System.out.println(solution(45));
    
    }
    public static int solution(int n) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        while(n>0) {
            int temp = n / 3;
            sb.append((n % 3));
            n = temp;
        }

        String[] str = sb.toString().split("");
        int index = 0;
        for(int i = str.length-1; i>=0; i--){
            answer += Math.pow(3, index) * Integer.parseInt(str[i]);
            index++;
        }


        return answer;
    }
}
