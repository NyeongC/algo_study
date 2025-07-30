package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
4 6
101111
101010
101011
111011
 */
public class Back006 {

    public static class Node{
        int x;
        int y;
        int count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};

        int[][] maps = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        int answer = 0;

        for (int i = 0; i < n; i++) {
            input = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                maps[i][j] = Integer.parseInt(input[j]);
            }
        }

        Queue<Node> q= new LinkedList<>();
        q.add(new Node(0, 0, 1));

        while(!q.isEmpty()) {
            Node now = q.poll();
            int x = now.x;
            int y = now.y;
            int count = now.count;
            if (x == n - 1 && y == m - 1) {
                answer = count;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + x;
                int ny = dy[i] + y;

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if(maps[nx][ny] == 0 || visited[nx][ny])
                    continue;

                visited[nx][ny] = true;

                q.add(new Node(nx, ny, count + 1));

            }



        }

        System.out.println(answer);

        br.close();

    }
}

