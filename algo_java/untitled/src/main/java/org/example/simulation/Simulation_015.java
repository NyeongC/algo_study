package org.example.simulation;

/*
 * 정렬된 연속한 부분수열의 개수
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Simulation_015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long count = 0;
        int len = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                len++;
            } else {
                count += (long) len * (len + 1) / 2;
                len = 1;
            }
        }

        count += (long) len * (len + 1) / 2;

        System.out.println(count);
    }
}
