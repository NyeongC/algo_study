package org.example.programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 *자연수 뒤집어 배열로 만들기
 * */
public class Solve_003 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(12345)));
    
    }

    public static int[] solution(long n) {
        int[] answer = {};

        ArrayList<Long> list = new ArrayList<>();

        while(n >0){
            list.add(n % 10);
            n = n / 10;
        }
        long temp = 0;
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            temp = list.get(i);
            answer[i] = (int)temp;
        }


        return answer;
    }
}
