package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
// 1181 - 단어 정렬
public class Main008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();

        while(n-->0){
            list.add(br.readLine());
        }

        Collections.sort(list,(a,b)->{
           if(a.length() == b.length()){
               return a.compareTo(b);
           }
           return a.length() - b.length();
        });

        for(String i : list){
            System.out.println(i);

        }


    }
}