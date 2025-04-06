package org.example.simulation;

/*
구간 합 구하기 5
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simulation_012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] arr = new int[n];

        input = br.readLine().split(" ");

        int sum = 0;
        int index = 0;
        for (String i : input) {
            sum += Integer.parseInt(i);
            arr[index++] = sum;
        }


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int e = Integer.parseInt(input[1]);

            if (s == 1) {
                sb.append(String.format("%.2f", ((double) arr[e - 1] / e))).append("\n");
            } else {
                sb.append(String.format("%.2f", ((double) (arr[e - 1] - arr[s - 2]) / (e - s + 1)))).append("\n");
            }

        }

        System.out.print(sb.toString());


    }
}
