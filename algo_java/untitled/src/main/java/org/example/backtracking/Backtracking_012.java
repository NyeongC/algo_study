package org.example.backtracking;

/*
 * 다음 순열
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Backtracking_012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String i : input) {
            sb.append(i).append(" ");
        }
        String key = sb.toString();

        Map<Integer, String> hm1 = new HashMap<>();
        Map<String, Integer> hm2 = new HashMap<>();

        permu(n, new ArrayList<>(), hm1, hm2);

        int index = hm2.get(key) + 1;
        System.out.println(hm1.getOrDefault(index, "-1"));
    }

    static void permu(int n, List<Integer> current,Map<Integer, String> hm1, Map<String, Integer> hm2) {
        if (current.size() == n) {
            StringBuilder sb = new StringBuilder();
            for (int i : current) {
                sb.append(i).append(" ");
            }
            int size = hm1.size();
            hm1.put(size, sb.toString());
            hm2.put(sb.toString(), size);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!current.contains(i)) {
                current.add(i);
                permu(n, current, hm1, hm2);
                current.remove(current.size() - 1);
            }
        }
    }
}
