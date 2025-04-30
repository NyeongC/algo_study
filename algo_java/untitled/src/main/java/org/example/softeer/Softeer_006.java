package org.example.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
효도 음식

입력예제1

6
4 -6 1 2 -2 3

출력예제1

8
* */

public class Softeer_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int[] left = new int[n];
        int[] right = new int[n];

        int max = arr[0];
        int curr = arr[0];
        left[0] = arr[0];

        for (int i = 1; i < n; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(curr, max);
            left[i] = max;
        }

        max = arr[n - 1];
        curr = arr[n - 1];
        right[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(curr, max);
            right[i] = max;
        }

        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            answer = Math.max(answer, left[i] + right[i + 2]);
        }

        System.out.print(answer);
    }
}