package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 문자열 집합
public class Main007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        HashSet<String> hs = new HashSet<>();


        while (n-- > 0) {
            hs.add(br.readLine());
        }
        int answer = 0;
        while (m-- > 0) {
            if (hs.contains(br.readLine()))
                answer++;
        }
        System.out.println(answer);
    }
}