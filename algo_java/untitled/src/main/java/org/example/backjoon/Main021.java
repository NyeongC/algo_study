package org.example.backjoon;

import java.io.*;
import java.util.*;

/*
* 수 찾기
* */
public class Main021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        String [] str = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        int [] target = new int[m];
        str = br.readLine().split(" ");
        for(int i=0; i<m; i++) {
            target[i] = Integer.parseInt(str[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int t : target) {
            if(bs(t,arr))
                sb.append("1").append("\n");
            else
                sb.append("0").append("\n");
        }

        System.out.println(sb.toString());

    }

    public static boolean bs(int n, int [] arr) {
        boolean result = false;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == n) {
                result = true;
                break;
            } else if (n < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}