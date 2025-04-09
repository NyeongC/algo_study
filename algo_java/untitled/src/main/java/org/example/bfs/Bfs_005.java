package org.example.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
1로 만들기
*/
public class Bfs_005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int goal = Integer.parseInt(br.readLine());

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{goal, 0});
        int answer = 1000000;

        while(!q.isEmpty()) {
            int[] temp = q.poll();
            int num = temp[0];
            int count = temp[1];

            if(num == 1) {
                answer = Math.min(count, answer);
                break;
            }

            if(num % 2 == 0) {

                q.add(new int[]{num / 2, count + 1});
            }

            if(num % 3 == 0) {
                q.add(new int[]{num / 3, count + 1});
            }

            if(num - 1 > 0) {
                q.add(new int[]{--num, count + 1});
            }
        }

        System.out.print(answer);
    }
}