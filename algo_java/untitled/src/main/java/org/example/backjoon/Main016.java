package org.example.backjoon;

import java.io.*;
import java.util.*;

/*
* 너의 평점은
* */
public class Main016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> hm = new HashMap<>();

        hm.put("A+",4.5);
        hm.put("A0",4.0);
        hm.put("B+",3.5);
        hm.put("B0",3.0);
        hm.put("C+",2.5);
        hm.put("C0",2.0);
        hm.put("D+",1.5);
        hm.put("D0",1.0);
        hm.put("F",0.0);

        double total = 0.0;
        double result = 0.0;
        for(int i=0; i<20; i++){
            String [] input = br.readLine().split(" ");
            if(input[2].equals("P"))
                continue;

            total += Double.parseDouble(input[1]);
            result += Double.parseDouble(input[1]) * hm.get(input[2]);

        }

        String answer = String.format("%.6f",result / total);
        System.out.println(answer);
    }
}