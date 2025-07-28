package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
두 수의 합
9
5 12 7 10 9 1 2 3 11
13

3
 */
public class Back003 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int answer = 0;

        int s = 0;
        int e = n - 1;
        while (s < e) {
            int target = arr[s] + arr[e];
            if (target == x) {
                answer++;
                s++;
                e--;
            } else if (target < x) {
                s++;
            } else {
                e--;
            }

        }

        System.out.println(answer);


        br.close();


    }
}


