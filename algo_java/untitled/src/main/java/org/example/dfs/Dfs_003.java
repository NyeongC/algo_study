package org.example.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
바이러스

*/
public class Dfs_003 {

    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        adjList = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            adjList[x].add(y);
            adjList[y].add(x);


        }

        br.close();

        dfs(1);

        System.out.println(answer);

    }

    static void dfs(int start) {

        if (start != 1 && !visited[start])
            answer++;

        visited[start] = true;

        ArrayList<Integer> list = adjList[start];

        for (Integer i : list) {
            if (!visited[i])
                dfs(i);
        }


    }
}