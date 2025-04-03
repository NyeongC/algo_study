package org.example.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
바이러스
*/
public class Dfs_004 {


    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        adjList = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) {
            adjList[i] = new ArrayList<>();
        }

        int v = Integer.parseInt(br.readLine());

        while (v-- > 0) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            adjList[x].add(y);
            adjList[y].add(x);
        }

        br.close();

        visited[1] = true;
        dfs(1);

        System.out.println(count);

    }

    static void dfs(int start) {

        if (!visited[start]) {
            count++;
            visited[start] = true;
        }

        ArrayList<Integer> list = adjList[start];

        for (int i : list) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }


}