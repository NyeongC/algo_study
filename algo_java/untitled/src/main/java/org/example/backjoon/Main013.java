package org.example.backjoon;

import java.io.*;
import java.util.*;

/*
* 백준 1181 단어 정렬
* */

public class Main013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 중복 제거를 위한 Set
        Set<String> s = new HashSet<>();

        for(int i=0; i<n; i++) {
            s.add(br.readLine());
        }

        List<String> list = new ArrayList<>(s);

        list.sort((a,b) ->{
            if(a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        for(String i : list) {
            System.out.println(i);
        }

    }
}