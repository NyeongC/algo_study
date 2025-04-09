package org.example.backtracking;

/*
 * 암호 만들기
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Backtracking_009 {

    static List<String> answer;

    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);

        char[] arr = new char[c];
        input = br.readLine().split(" ");
        for(int i =0; i< c; i++) {
            arr[i] = input[i].charAt(0);
        }

        Arrays.sort(arr);

        answer = new ArrayList<>();

        List<Character> list = new ArrayList<>();

        combi(l, c, arr, list, 0, new boolean[c], 0);

        for(String i : answer) {
            System.out.println(i);
        }

    }

    static void combi(int l, int c, char[] arr, List<Character> list, int count, boolean[] visited, int index) {
        if (count == l) {
            int vowel = 0;
            int consonant = 0;

            for (char ch : list) {
                if ("aeiou".indexOf(ch) >= 0) vowel++;
                else consonant++;
            }

            if (vowel >= 1 && consonant >= 2) {
                StringBuilder temp = new StringBuilder();
                for (char i : list) {
                    temp.append(i);
                }
                answer.add(temp.toString());
            }
            return;
        }

            for(int i = index; i < c; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    list.add(arr[i]);
                    count++;
                    combi(l, c, arr, list, count, visited, i + 1);
                    count--;
                    list.remove(list.size() -1);
                    visited[i] = false;
                }
            }


    }


}