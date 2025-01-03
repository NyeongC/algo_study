package org.example.bfs;
import java.util.*;
/*
BFS 문제, 방문 기록과 현재 변환값이 목표인 y 보다 작을때 방문 가능

*/
public class Bfs_001 {

    public int solution(int x, int y, int n) {
        int answer = -1;

        Queue<int []> q = new LinkedList<>();

        // 방문 최대 값
        boolean [] visited = new boolean[1000000*3];

        q.add(new int[]{x,0});

        while(!q.isEmpty()) {
            int [] temp = q.poll();

            if(temp[0] == y) {
                return temp[1];
            }

            if(!visited[temp[0] + n] && temp[0] + n <= y){
                q.add(new int[]{temp[0] + n,temp[1] + 1});
                visited[temp[0] + n] = true;
            }
            if(!visited[temp[0] * 2] && temp[0] * 2 <= y){
                q.add(new int[]{temp[0] * 2,temp[1] + 1});
                visited[temp[0] * 2] = true;
            }
            if(!visited[temp[0] * 3] && temp[0] * 3 <= y){
                q.add(new int[]{temp[0] * 3,temp[1] + 1});
                visited[temp[0] * 3] = true;
            }


        }

        return answer;
    }
}
