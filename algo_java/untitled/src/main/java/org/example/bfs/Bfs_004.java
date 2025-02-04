package org.example.bfs;

import java.util.LinkedList;
import java.util.Queue;

/*
미로 탈출

*/
public class Bfs_004 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"}));
    }

    static class Node {
        int x;
        int y;
        int count;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    static Node S;
    static Node L;
    static Node E;
    static boolean[][] visited;
    static int N,M;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static int solution(String[] maps) {
        int answer = 0;
        N = maps.length;
        M = maps[0].length();

        // 레버 및 출구 위치 찾기
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(maps[i].charAt(j) == 'L'){
                    L = new Node(i,j);
                } else if(maps[i].charAt(j) == 'E') {
                    E = new Node(i,j);
                } else if(maps[i].charAt(j) == 'S') {
                    S = new Node(i,j);
                }
            }
        }

        // 레버까지의 거리 계산
        answer += bfs(S, L, maps);

        // 출구까지의 거리 계산
        answer += bfs(S, E, maps);

        // 반드시 레버랑 도착점이 방문했는지 체크 해야함(레버안찍고 도착하거나, 도착점에 도달 안한케이스)
        return visited[E.x][E.y] && visited[L.x][L.y] ? answer : -1;
    }

    static int bfs(Node start, Node end, String[] maps) {
        int num = 0;

        visited= new boolean[N][M];

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(start.x,start.y,0));

        while(!q.isEmpty()) {
            Node now = q.poll();
            int x = now.x;
            int y = now.y;

            if(x == end.x && y == end.y) {
                num = now.count;
                S = new Node(x, y);
                break;
            }


            int count = now.count;

            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx<0 || ny <0 || nx>=N || ny>=M)
                    continue;

                if(maps[nx].charAt(ny) == 'X')
                    continue;

                if(visited[nx][ny])
                    continue;

                q.add(new Node(nx, ny, count + 1));
                visited[nx][ny] = true;

            }
        }

        return num;
    }

}
