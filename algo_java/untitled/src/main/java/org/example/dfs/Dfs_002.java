package org.example.dfs;

import java.util.ArrayList;
import java.util.Arrays;

/*
네트워크

*/
public class Dfs_002 {

    public static void main(String[] args) {
        System.out.println(solution(3,new int[][]{{1, 1, 0},{1, 1, 0},{0, 0, 1}}));
    }

    static boolean[] visited;
    static ArrayList<Integer>[] adjList;


    public static int solution(int n, int[][] computers) {
        int answer = 0;

        visited = new boolean[n+1];
        adjList = new ArrayList[n+1];

        for(int i=0; i<adjList.length; i++){
            adjList[i] = new ArrayList<>();
        }


        int index = 1;

        for(int[] temp : computers) {
            for(int i=0; i<temp.length; i++){

                if(temp[i] != 0){
                    adjList[index].add(i+1);
                }


            }
            index++;
        }

        for(int i=1; i<=n; i++) {
            if(!visited[i]){
                answer++;
                dfs(i);
            }

        }

        return answer;
    }

    static void dfs(int start) {
        visited[start] = true;

        for(int t : adjList[start]){
            if(!visited[t]){
                dfs(t);
            }
        }

    }
}
