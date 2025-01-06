package org.example.simulation;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/*
3
1 3
2 4
3 5
* */

public class Simulation_002 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        ArrayList<int [] > list = new ArrayList<>();

        while(n-->0) {
            String [] temp = br.readLine().split(" ");
            list.add(new int [] {Integer.parseInt(temp[0]), Integer.parseInt(temp[1])});
        }

        Collections.sort(list, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]); // 시작 시간 기준 오름차순
            } else {
                return Integer.compare(a[1], b[1]); // 종료 시간 기준 오름차순
            }
        });

        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(list.get(0)[1]);

        for(int i=1; i<list.size(); i++) {

            if(pq.peek() <= list.get(i)[0]){
                pq.poll();
            }

            pq.add(list.get(i)[1]);
        }

        System.out.println(pq.size());




    }
}
