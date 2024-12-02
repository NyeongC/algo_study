package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
// 베스트셀러
public class Main010 {

    static class Book{
        String name;
        int num;

        public Book(String name, int num){
            this.name = name;
            this.num = num;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Book> list = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        while(n-->0){
            String temp = br.readLine();
            if(!hm.containsKey(temp)){
                hm.put(temp,1);
            }else{
                hm.put(temp,hm.get(temp)+1);
            }
        }

        for(String s : hm.keySet()){
            list.add(new Book(s,hm.get(s)));
        }

        Collections.sort(list,(a,b)->{
            if(a.num == b.num){
                return a.name.compareTo(b.name);
            }
            else if(a.num < b.num){
                return 1;
            } else{
                return -1;
            }
        });

        System.out.print(list.get(0).name);
    }
}