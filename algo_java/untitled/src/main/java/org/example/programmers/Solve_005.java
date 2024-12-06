package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;

/*
 * [PCCE 기출문제] 9번 / 지폐 접기
 * */
public class Solve_005 {

    public static void main(String[] args) throws IOException {
        System.out.println((solution(new int[]{50, 50}, new int[]{100,241})));
    
    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int temp = 0;
        while(true){

            // 검증, 바로 및 90도
            if(wallet[0]>=bill[0] && wallet[1]>=bill[1]){
                break;
            } else if (wallet[0]>=bill[1] && wallet[1]>=bill[0]){
                break;
            }

            // 종이 접기
            answer++;
            if(bill[0]>bill[1]){
                temp = bill[0];
                bill[0] = (int)temp/2;
            } else{
                temp = bill[1];
                bill[1] = (int)temp/2;
            }

        }



        return answer;
    }
}
