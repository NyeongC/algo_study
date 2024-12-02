package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
// 요세푸스 문제
public class Main005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        String [] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        for(int i=0; i<N; i++){
            q.add(i+1);

        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int temp = 0;
        while(!q.isEmpty()){
            for(int i=0; i<K-1; i++){
                temp = q.poll();
                q.add(temp);
            }
            if(q.size() == 1){
                sb.append(q.poll()+">");
            } else{
                sb.append(q.poll()+", ");
            }

        }
        System.out.println(sb.toString());



    }
}