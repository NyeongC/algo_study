package org.example.bfs;

import java.util.LinkedList;
import java.util.Queue;

/*
책 p.420
게임 맵 최단거리

*/
public class Bfs_003 {

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(int[][] maps) {

        int N = maps.length;
        int M = maps[0].length;

        int[][] dist = new int[N][M];
        dist[0][0] = 1;

        Queue<Node> q = new LinkedList<>();

        q.add(new Node(0,0));

        while(!q.isEmpty()) {
            Node now = q.poll();
            int x = now.x;
            int y = now.y;

            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx<0 || ny <0 || nx>=N || ny>=M)
                    continue;

                if(maps[nx][ny] == 0)
                    continue;

                if(dist[nx][ny] == 0){
                    q.add(new Node(nx,ny));
                    dist[nx][ny] = dist[x][y] + 1;
                }

            }
        }

        return dist[N-1][M-1] == 0 ? -1: dist[N-1][M-1];
    }

}
