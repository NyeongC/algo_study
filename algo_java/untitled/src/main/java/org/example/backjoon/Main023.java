package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 수리공 항승
 * 투 포인터
 * */
public class Main023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);

        int answer = 0;

        input = br.readLine().split(" ");
        int[] arr = new int[N];

        br.close();

        int idx = 0;

        for (String i : input) {
            arr[idx++] = Integer.parseInt(i);
        }

        Arrays.sort(arr);

        int left = 0;
        int right = 0;

        while (left < N && right < N) {
            if (arr[right] - arr[left] + 1 <= L) {
                if (right + 1 == N) {
                    answer++;
                    right++;
                } else if (right < N) {
                    right++;
                }
            } else {
                answer++;
                left = right;
            }
        }

        System.out.println(answer);


    }
}