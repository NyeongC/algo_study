package org.example.simulation;

/*
이건 꼭 풀어야 해!
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Simulation_014 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);

        int[] arr = new int[n + 1];

        input = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            arr[i + 1] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        for (int i = 0; i< arr.length - 1; i++) {
            arr[i + 1] += arr[i];
        }


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int e = Integer.parseInt(input[1]);

            sb.append(arr[e] - arr[s - 1]).append("\n");

        }

        System.out.print(sb.toString());


    }
}
