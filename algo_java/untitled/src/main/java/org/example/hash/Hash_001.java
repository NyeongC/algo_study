package org.example.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * CD 4158
 *
 * */
public class Hash_001 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int count = 0;
            Set<Integer> s = new HashSet<>();

            String[] temp = br.readLine().split(" ");

            int n = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);

            if (n == 0 && m == 0)
                break;

            for (int i = 0; i < n; i++) {
                s.add(Integer.parseInt(br.readLine()));
            }

            for (int i = 0; i < m; i++) {
                if (s.contains(Integer.parseInt(br.readLine()))) {
                    count++;
                }
            }
            System.out.println(count);

        }


    }

    private static void getPrintln(int count) {
        System.out.println(count);
    }


}
