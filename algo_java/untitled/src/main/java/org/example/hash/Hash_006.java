package org.example.hash;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
* 패션왕 신해빈
* */

public class Hash_006 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {

            Map<String, Integer> hm = new HashMap<>();

            int m = Integer.parseInt(br.readLine());

            for (int i = 0; i < m; i++) {
                String[] input = br.readLine().split(" ");
                hm.put(input[1], hm.getOrDefault(input[1], 0) + 1);
            }


            int total = 1;
            for (int count : hm.values()) {
                total *= (count + 1);  // 각 카테고리에서 선택하는 경우의 수 (+1은 선택하지 않는 경우 포함)
            }

            sb.append(total - 1).append("\n");  // 모든 의상을 입지 않는 경우(1)를 제외


        }

        System.out.print(sb.toString());

    }


}