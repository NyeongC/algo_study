package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 소수 구하기
 * */
public class Main024 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        br.close();

        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        for (int i = start; i <= end; i++) {
            if (isPrime(i))
                System.out.println(i);
        }


    }

    static boolean isPrime(int num) {
        boolean b = true;
        int n = (int) Math.sqrt(num);

        for (int i = 2; i <= n; i++) {
            if (num % i == 0) {
                b = false;
                break;
            }
        }

        return num == 1 ? false : b;

    }
}