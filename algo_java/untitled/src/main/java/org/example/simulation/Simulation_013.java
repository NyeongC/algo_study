package org.example.simulation;

/*
구간 합 구하기 4
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simulation_013 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n + 1];

        input = br.readLine().split(" ");

        int sum = 0;
        int index = 1;
        for (String i : input) {
            sum += Integer.parseInt(i);
            arr[index++] = sum;
        }


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int e = Integer.parseInt(input[1]);

            sb.append(arr[e] - arr[s - 1]).append("\n");

        }

        System.out.print(sb.toString());


    }
}
