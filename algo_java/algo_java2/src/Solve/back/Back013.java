package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back013 {

    // 북 동 남 서
    static int[][] dir = {{-1, 0},{0, 1},{1, 0},{0 ,-1}};
    static int n;
    static int m;
    static int[][] maps;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        maps = new int[n][m];

        input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        int answer = 0;

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                maps[i][j] = Integer.parseInt(input[j]);
            }
        }

        while (true) {
            // 현재 칸 청소
            if (maps[x][y] == 0) {
                maps[x][y] = 2;
                answer++;
            }

            if (!check(x, y)) {
                // 후진
                int backDir = (d + 2) % 4;
                int nx = x + dir[backDir][0];
                int ny = y + dir[backDir][1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m || maps[nx][ny] == 1) {
                    break; // 후진 불가 시 종료
                }

                x = nx;
                y = ny;
                continue;
            }

            // 반시계 회전 후 한 칸 전진 시도
            d = (d + 3) % 4;
            int nx = x + dir[d][0];
            int ny = y + dir[d][1];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 0) {
                x = nx;
                y = ny;
            }
            // 못가면 방향만 바꾸고 다음 루프에서 다시 체크
        }

        System.out.println(answer);
    }

    // 주변 4칸에 청소 안된 공간이 있는지 확인
    static boolean check(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (maps[nx][ny] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
