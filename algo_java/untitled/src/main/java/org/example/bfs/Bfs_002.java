package org.example.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
책 p.406
너비 우선 탐색 순회

[1, 2, 4, 5, 6, 3]

*/
public class Bfs_002 {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(solution(new int[][]{{1,2},{1,3},{2,4},{2,5},{3,6},{3,7},{4,8},{5,8},{6,9},{7,9}},1,9)));
        System.out.println(Arrays.toString(solution(new int[][]{{1,3},{3,4},{3,5},{5,2}},1,5)));
    }


    static boolean[] visited;
    static ArrayList<Integer> answer;
    static ArrayList<Integer>[] adjList;

    public static int [] solution(int [][] graph, int start, int n) {

        adjList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        answer = new ArrayList<>();

        for(int i=0; i<adjList.length; i++){
            adjList[i] = new ArrayList<>();
        }

        for(int[] edge : graph) {
            adjList[edge[0]].add(edge[1]);
        }

        bfs(start);


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    static void bfs(int start) {
        visited[start] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);


        while(!q.isEmpty()) {
            int temp = q.poll();
            answer.add(temp);

            for(int t : adjList[temp]) {
                if(!visited[t]){
                    q.add(t);
                    visited[t] = true;

                }
            }

        }
    }
}
