package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
탈출

3 6
D...*.
.X.X..
....S.

6
*/
public class Back018 {
    public static class Node {
        int x;
        int y;
        int count;

        Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static int n;
    static int m;
    static int[][] maps;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        maps = new int[n][m];
        visited = new boolean[n][m];
        Node start = new Node(0, 0, 0);
        Node end = new Node(0, 0, 0);
        for (int i = 0; i < n; i++) {
            input = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                int in = 0;
                String command = input[j];
                // S: 1, D: 2, *: 3, X:4
                if (command.equals("S")) {
                    in = 1;
                    start = new Node(i, j, 0);
                } else if (command.equals("D")) {
                    in = 2;
                    end = new Node(i, j, 0);
                } else if (command.equals("*")) {
                    in = 3;
                } else if (command.equals("X")) {
                    in = 4;
                }
                maps[i][j] = in;
            }
        }

        System.out.println(bfs(start, end));


    }

    public static String bfs(Node start, Node end) {

        String answer = "KAKTUS";

        Queue<Node> q = new LinkedList<>();

        q.add(start);


        while (!q.isEmpty()) {
            Node now = q.poll();
            int x = now.x;
            int y = now.y;
            int count = now.count;
            visited[x][y] = true;
            if (end.x == x && end.y == y) {
                answer = "" + count;
                break;
            }
            //System.out.println(x + " " + y + " " + count);
            int[][] t_maps = getMaps(count + 1);

            for (int i = 0; i < 4; i++) {

                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;

                if (t_maps[nx][ny] == 3 || t_maps[nx][ny] == 4)
                    continue;

                if (visited[nx][ny])
                    continue;


                if (t_maps[nx][ny] == 0 || t_maps[nx][ny] == 2) {
                    q.add(new Node(nx, ny, count + 1));
                }

            }


        }

        return answer;
    }

    public static int[][] getMaps(int count) {
        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = maps[i][j];
            }
        }


        Queue<int[]> q = new LinkedList<>();

        for (int k = 0; k < count; k++) {

            // 물 확인
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (result[i][j] == 3) {
                        q.add(new int[]{i, j});
                    }
                }
            }

            while (!q.isEmpty()) {
                int[] temp = q.poll();
                int x = temp[0];
                int y = temp[1];
                for (int i = 0; i < 4; i++) {

                    int nx = dx[i] + x;
                    int ny = dy[i] + y;

                    if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                        continue;

                    if (result[nx][ny] == 0) {
                        result[nx][ny] = 3;
                    }


                }
            }


        }

        return result;
    }

}