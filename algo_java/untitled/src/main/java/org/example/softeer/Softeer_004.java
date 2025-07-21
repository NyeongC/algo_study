package org.example.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
루돌프 월드컵

입력예제1

72 20 20 20

출력예제1

87.328
* */

public class Softeer_004 {
    static double answer = 0.0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        br.close();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int[][] match = {{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};

        simulation(arr, 0, 1.0, match, new int[4]);

        System.out.println(String.format("%.3f", answer * 100));

    }

    static void simulation(int[] power, int index, double total, int[][] matchs, int[] score) {
        if (index == 6) {
            if (isSelected(score)) {
                answer += total;
            }
            return;
        }

        int[] match = matchs[index];

        int i = match[0] - 1;
        int j = match[1] - 1;

        double com = 5 * power[i] + 5 * power[j];
        double winI = 4 * power[i];
        double winJ = 4 * power[j];

        // i
        score[i] += 3;
        simulation(power, index + 1, total * winI / com, matchs, score);
        score[i] -= 3;
        // j
        score[j] += 3;
        simulation(power, index + 1, total * winJ / com, matchs, score);
        score[j] -= 3;
        // i j
        score[i] += 1;
        score[j] += 1;
        simulation(power, index + 1, total * (power[i] + power[j]) / com, matchs, score);
        score[i] -= 1;
        score[j] -= 1;


    }

    static boolean isSelected(int[] score) {
        //System.out.println(Arrays.toString(score));
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new int[]{i, score[i]});
        }
        Collections.sort(list,(a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(b[1], a[1]);
            }
        });
        for (int[] i : list) {
            //System.out.println(Arrays.toString(i));
        }
        return list.get(0)[0] == 0 || list.get(1)[0] ==0;
    }
}