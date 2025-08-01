package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
3 3
1 1 0
1 1 1
1 0 1
1 1 1
 */
public class Back013 {

    static int n;
    static int m;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] maps;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        maps = new int[n][m];
        int answer = 0;
        input = br.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                maps[i][j] = Integer.parseInt(input[j]);
            }
        }
        int count = 0;
        while (true) {
            count++;
            // 현재칸이 청소되지 않았다면 청소
            if (maps[x][y] == 0) {
                maps[x][y] = 2;
                answer++;
            }

//            System.out.println(x +" " + y);
//            if(count > 100)
//                break;

            // 주변에 갈수있는곳이 없을때
            if (!check(x, y)) {

                // 후진
                int back = (d + 2) % 4;
                int nx = x + dx[back];
                int ny = y + dy[back];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                    break;

                if (maps[nx][ny] == 1)
                    break;

                x = nx;
                y = ny;
                continue;
            }
            // 반시계 회전
            d = (d + 3) % 4;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (!(nx < 0 || ny < 0 || nx >= n || ny >= m)) {
                if (maps[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }


            }


        }


        System.out.println(answer);

        br.close();

    }

    static boolean check(int x, int y) {
        boolean result = false;

        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                continue;

            if (maps[nx][ny] == 0)
                result = true;


        }

        return result;
    }
}