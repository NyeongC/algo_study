package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
/*
* 백준 18870 좌표 압축
* */
public class Main012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String [] str = br.readLine().split(" ");

        int [] arr1 = new int[n];
        int [] arr2 = new int[n];

        for(int i=0; i<n; i++) {
            arr1[i] = arr2[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr1);

        HashMap<Integer, Integer> hm = new HashMap<>();

        int index = 0;

        for (int i : arr1) {
            if (hm.get(i) == null) {
                hm.put(i,index++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i : arr2) {
            sb.append(hm.get(i)).append(" ");
        }

        System.out.println(sb.toString());

    }
}