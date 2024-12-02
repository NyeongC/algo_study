package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//소트인사이드
public class Main009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Integer.parseInt(br.readLine());
        ArrayList<Long> list = new ArrayList<>();
        while(num>0){
            list.add(num % 10);
            num = num / 10;
        }
        Collections.sort(list,(a,b)->{
            if(a<b)
                return 0;
            else
                return -1;
        });
        for(Long i : list)
            System.out.print(i);
    }
}