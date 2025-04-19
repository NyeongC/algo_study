package org.example.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Softeer_001 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        dfs(0, arr, new boolean[n][n], 0);

        System.out.println(answer);

    }

    public static void dfs(int depth, int[][] arr, boolean[][] visited, int total) {
        if (depth == 4) {
            answer = Math.max(answer, total);
            return;
        }

        boolean flag = true;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int x = i;
                int y = j;
                if (!visited[x][y]) {
                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if (nx < 0 || ny < 0 || nx >= arr.length || ny >= arr.length) {
                            continue;
                        }

                        if (!visited[nx][ny]) {
                            flag = false;
                            visited[x][y] = true;
                            visited[nx][ny] = true;
                            total += arr[x][y] + arr[nx][ny];
                            dfs(depth + 1, arr, visited, total);
                            visited[x][y] = false;
                            visited[nx][ny] = false;
                            total -= arr[x][y] + arr[nx][ny];
                        }

                    }
                }


            }
        }

        // 뎁스가 4미만일 경우
        if (flag) {
            answer = Math.max(answer, total);
        }


    }
}
