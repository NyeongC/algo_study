package org.example.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/*
약수가 포인트
Math.sqrt()
* */

public class Simulation_003 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1; i<=number; i++) {
            int cc = count(i);
            if(cc > limit)
                answer += power;
            else
                answer += cc;
        }

        return answer;
    }

    public int count(int num) {
        int result = 0;

        for(int i=1; i <= Math.sqrt(num); i++) {

            if(i == Math.sqrt(num))
                result += 1;
            else if(num % i == 0)
                result += 2;

        }
        return result;

    }
}
