package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
6 4
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 1

8
 */
public class Back012 {

    static int[][] maps;
    static Queue<int[]> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int answer = 0;

        q = new LinkedList<>();

        maps = new int[n][m];

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                maps[i][j] = Integer.parseInt(input[j]);
                if (maps[i][j] == 1) {
                    q.add(new int[]{i, j, 1});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] now = q.poll();
            //System.out.println(now[0] + " " + now[1]);
            spread(now[0], now[1], now[2], n, m);


        }

        // 점검
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = Math.max(answer, maps[i][j]);
            }
        }

        // 점검
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if(maps[i][j] == 0) {
                    answer = 0;
                    break;
                }
            }
        }

        System.out.println(answer - 1);



    }

    static void spread(int x, int y, int count, int n, int m) {
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                continue;

            if (maps[nx][ny] == 0) {
                maps[nx][ny] = count + 1;
                //System.out.println(nx + " " + ny);
                q.add(new int[]{nx, ny ,count + 1});
            }
        }
    }


}