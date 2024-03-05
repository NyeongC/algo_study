package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> s = new HashSet<>();

        for(int i=0; i<n; i++){
            s.add(br.readLine());
        }

        List<String> list = new ArrayList<>(s);
        Collections.sort(list,(a,b)->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        for(String str : list){
            System.out.println(str);
        }

    }
}