package org.example.backtracking;

/*
 * 부분수열의 합
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Backtracking_008 {

    static int answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");
        br.close();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        find(arr, n, 0, s, new int[n], 0);

        System.out.println(s == 0 ? answer - 1 : answer);

    }

    static void find(int[] arr, int n, int count, int s, int[] temp, int index) {

        if (count == n) {
            //System.out.println(Arrays.toString(temp));
            int sum = 0;
            for (int i : temp) {
                sum += i;
            }
            if (sum == s) {
                //System.out.println(Arrays.toString(temp));
                answer++;
            }
            return;
        }


        temp[index] = arr[index];
        find(arr, n, count + 1, s, temp, index + 1);

        temp[index] = 0;
        find(arr, n, count + 1, s, temp, index + 1);


    }


}