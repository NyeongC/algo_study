package org.example.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 주몽 1940
 *
 * */
public class Hash_002 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int m = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int answer = 0;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            int temp = Integer.parseInt(str[i]);
            if (hm.containsKey(m - temp)) {
                answer++;
            }
            hm.put(temp, hm.getOrDefault(temp, 0) + 1);

        }
        System.out.println(answer);


    }


}
