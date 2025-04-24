package org.example.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
우물 안 개구리

입력예제2

5 3
7 5 7 7 1
1 2
2 3
3 4

출력예제2

2
* */

public class Softeer_005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] power = new int[n];
        input = br.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < n; i++) {
            power[i] = Integer.parseInt(input[i]);
        }
        int[][] matchs = new int[m][2];
        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            matchs[i][0] = Integer.parseInt(input[0]);
            matchs[i][1] = Integer.parseInt(input[1]);
        }
        br.close();

        List<PriorityQueue<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new PriorityQueue<>(Collections.reverseOrder()));
        }

        // 자기 자신의 power는 넣지 않는다
        for (int i = 0; i < m; i++) {
            int a = matchs[i][0] - 1;
            int b = matchs[i][1] - 1;
            list.get(a).add(power[b]);
            list.get(b).add(power[a]);
        }

        for (int i = 0; i < n; i++) {
            if (list.get(i).isEmpty()) {
                answer++;
            } else {
                int max = list.get(i).peek();
                if (power[i] > max) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}