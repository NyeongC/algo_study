package org.example.simulation;

/*
* 수학문제 구현 정도로 느낌
* */

public class Simulation_001 {

    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n>=a) {
            int temp = n % a;
            n = (n / a ) * b;
            answer += n;
            n = n + temp;

        }


        return answer;
    }
}
