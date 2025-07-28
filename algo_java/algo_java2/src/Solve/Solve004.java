package Solve;

import java.util.*;

/*
프로그래머스 소수 찾기
순열 + 중복제거(집합) + 소수판별(제곱근)
*/
public class Solve004 {


    class Solution {

        class Node {
            int x, y, count;
            Node(int x, int y) { this.x = x; this.y = y; }
            Node(int x, int y, int count) { this.x = x; this.y = y; this.count = count; }
        }

        Node S, E, L;
        int N, M;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        public int solution(String[] maps) {
            N = maps.length;
            M = maps[0].length();

            // 시작점, 레버, 도착점 좌표 저장
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    char c = maps[i].charAt(j);
                    if (c == 'S') S = new Node(i, j, 0);
                    else if (c == 'L') L = new Node(i, j);
                    else if (c == 'E') E = new Node(i, j);
                }
            }

            int toLever = bfs(S, L, maps);
            int toEnd = bfs(L, E, maps);

            if (toLever == -1 || toEnd == -1) return -1;

            return toLever + toEnd;
        }

        public int bfs(Node s, Node e, String[] maps) {
            boolean[][] visited = new boolean[N][M];
            Queue<Node> q = new LinkedList<>();
            q.add(s);
            visited[s.x][s.y] = true;

            while (!q.isEmpty()) {
                Node cur = q.poll();

                if (cur.x == e.x && cur.y == e.y) {
                    return cur.count;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = cur.x + dx[i];
                    int ny = cur.y + dy[i];

                    if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                    if (visited[nx][ny]) continue;
                    if (maps[nx].charAt(ny) == 'X') continue;

                    visited[nx][ny] = true;
                    q.add(new Node(nx, ny, cur.count + 1));
                }
            }

            return -1; // 도달 불가
        }
    }

}
