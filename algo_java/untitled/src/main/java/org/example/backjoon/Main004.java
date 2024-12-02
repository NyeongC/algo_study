package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
// 백준 - 나는야 포켓몬 마스터 이다솜
public class Main004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        HashMap<Integer,String> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        String temp = "";
        for(int i=0; i<n; i++){
            temp = br.readLine();
            hm1.put(i+1,temp);
            hm2.put(temp,i+1);
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++){
            temp = br.readLine();
            if(Character.isDigit(temp.charAt(0))){
                sb.append(hm1.get(Integer.parseInt(temp)));
            } else{
                sb.append(hm2.get(temp));
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());


    }
}