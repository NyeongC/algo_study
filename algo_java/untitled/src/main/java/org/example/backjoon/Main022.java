package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 거스름돈
 * */
public class Main022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        int n = 1000 - Integer.parseInt(br.readLine());

        int[] dom = {500, 100, 50, 10, 5, 1};

        for(int i : dom) {
            while(n >= i) {
                answer++;
                n -= i;
            }
        }

        System.out.println(answer);

    }
}