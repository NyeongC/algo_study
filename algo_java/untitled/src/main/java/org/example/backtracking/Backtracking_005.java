package org.example.backtracking;

/*
 * 부분수열의 합
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backtracking_005 {

    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);

        int[] arr = new int[n];

        input = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        br.close();

        find(arr, new int[n], 0, 0, n, s);


        System.out.println(s == 0 ? answer - 1 : answer);


    }

    static void find(int[] arr, int[] numbers, int count, int index, int n, int s) {
        if (count == n) {
            int total = 0;
            for (int i : numbers) {
                total += i;
            }
            if (s == total) {
                answer++;
            }
            //System.out.println(Arrays.toString(numbers));
            return;
        }


        numbers[index] = arr[index];

        find(arr, numbers, count + 1, index + 1 , n , s);

        numbers[index] = 0;

        find(arr, numbers, count + 1, index + 1 , n , s);

    }
}