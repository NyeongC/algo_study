package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main000 {
    static List<List<Integer>> results = new ArrayList<>();

    static int answer;

    public static void main(String[] args) {
        int[] directions = {1, 2, 3, 4};  // 1: 동, 2: 남, 3: 서, 4: 북
        boolean[] used = new boolean[directions.length];
        int[][] dir = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
        List<Integer> current = new ArrayList<>();

        int[][] map = new int[][]{{1,1,2},{4,4,2},{3,3,3}};

        permute(directions, used, current);

        // 출력
        for (List<Integer> result : results) {
            Map<Integer, int[]> hm = new HashMap<>();
            boolean[][] visited = new boolean[map.length][map.length];
            for(int i = 0; i < result.size(); i++) {
                hm.put(i + 1, dir[result.get(i)-1]);
            }
            for(int[] a : hm.values()) {
                //System.out.print(a[0]+","+a[1]+" ");
            }
            //System.out.println();
            dfs(hm,0,0,visited,map,0);
        }

        System.out.println(answer);
    }

    static void dfs(Map<Integer, int[]> hm, int x, int y, boolean[][] visited, int[][] map, int count) {
        int len = visited.length;

        int[] temp = hm.get(map[x][y]);
        //System.out.println(Arrays.toString(temp));
        int nx = x + temp[0];
        int ny = y + temp[1];

        if(nx >= len || ny >= len || nx < 0 || ny < 0){
            answer = Math.max(answer, count + 1);
            return;
        }


        if(!visited[nx][ny]) {
            visited[nx][ny] = true;
            dfs(hm, nx, ny, visited, map, count + 1);
            visited[nx][ny] = false;
        }


    }

    public static void permute(int[] arr, boolean[] used, List<Integer> current) {
        if (current.size() == arr.length) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                current.add(arr[i]);
                permute(arr, used, current);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}