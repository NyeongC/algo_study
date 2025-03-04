package org.example.simulation;

/*
구간 합 구하기 5
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simulation_011 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                mat[i][j] = Integer.parseInt(input[j]);
            }


        }

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);

            int sum = 0;

            for (int j = x1 - 1; j < x2; j++) {
                for (int k = y1 - 1; k < y2; k++) {
                    sum += mat[j][k];
                }
            }

            sb.append(sum).append("\n");

        }


        br.close();


        System.out.println(sb.toString());

    }
}
