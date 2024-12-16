package org.example.backjoon;

import java.io.*;
import java.util.Arrays;

/*
* 좌표 정렬하기 2
* */
public class Main017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int [n][2];
        int i = 0;
        while(n-->0) {
            String [] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
            i++;
        }

        Arrays.sort(arr,(a,b)->{
            if(a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        for(int [] s : arr){
            System.out.println(s[0] + " " + s[1]);
        }

    }
}