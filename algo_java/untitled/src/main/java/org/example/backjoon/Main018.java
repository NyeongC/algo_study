package org.example.backjoon;


import java.util.*;
import java.io.*;
/*
*
* */
public class Main018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String [] str = br.readLine().split(" ");

        int target = Integer.parseInt(br.readLine());

        int [] arr = new int[n];

        int index = 0;

        for(String s : str) {
            arr[index++] = Integer.parseInt(s);
        }

        // 배열 정렬
        Arrays.sort(arr);

        int left = 0, right = n - 1;
        int answer = 0;

        // 투 포인터 기법
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                answer++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(answer);

    }
}