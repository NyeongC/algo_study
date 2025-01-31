package org.example.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 숫자 개수를 저장할 배열 (카운팅 정렬)
        int[] count = new int[10001];

        // 입력값을 받아서 count 배열에 저장
        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        // 정렬된 결과 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i]-- > 0) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }
}

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        int[] arr = new int [n];
//
//        int index = 0;
//
//        while(n-->0) {
//            arr[index++] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.stream(arr).sorted().forEach(System.out::println);
//
//
//    }

