package org.example.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
책 p.402
깊이 우선 탐색 순회

[1, 2, 4, 5, 6, 3]

*/
public class Dfs_001 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{1,2},{1,3},{2,4},{2,5},{3,6},{5,6}},1,6)));
    }

    // 인접 리스트
    static ArrayList<Integer> [] adjList;

    static ArrayList<Integer> answer;
    static boolean [] visited;


    public static int [] solution(int [][] graph, int start, int n) {

        adjList = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        answer = new ArrayList<>();

        for(int i=0; i<adjList.length; i++){
            adjList[i] = new ArrayList<>();
        }

        for(int i=0; i<graph.length; i++) {
            adjList[graph[i][0]].add(graph[i][1]);
        }

        dfs(start);


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    static void dfs(int start) {
        visited[start] = true;
        answer.add(start);

        ArrayList<Integer> temp = adjList[start];

        for(Integer t : temp) {
            if(!visited[t])
                dfs(t);
        }


    }
}
