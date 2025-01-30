package org.example.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting002 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int target = Integer.parseInt(br.readLine());

        int i = 0;
        int j = n - 1;

        int count = 0;

        while (i < j) {
            int temp = arr[i] + arr[j];

            if (target == temp) {
                count++;
                i += 1;
                j -= 1;
            } else if (target > temp) {
                i += 1;
            } else {
                j -= 1;
            }

        }

        System.out.println(count);


    }
}
