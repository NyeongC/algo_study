package org.example.backjoon;


import java.util.*;
import java.io.*;


/*
 * 국회의원 선거
 * */
public class Main014 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int target = Integer.parseInt(br.readLine());
        int result = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n-1; i++) {
            maxHeap.add(Integer.parseInt(br.readLine()));
        }

        while(!maxHeap.isEmpty() && target <= maxHeap.peek()){
            result++;
            target++;
            maxHeap.add(maxHeap.poll()-1);
        }

        System.out.println(result);

    }
}