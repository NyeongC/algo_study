package org.example.backjoon;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
* 카드2
* */
public class Main019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 큐 선언
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            q.add(i+1);
        }
        int answer = 0;
        while(!q.isEmpty()){
            // 최상단 빼기
            answer = q.poll();
            if(!q.isEmpty()){
                // 그 다음 값을 빼서
                int temp = q.poll();

                // 큐에 넣기
                q.add(temp);
            }

        }

        System.out.println(answer);
    }
}