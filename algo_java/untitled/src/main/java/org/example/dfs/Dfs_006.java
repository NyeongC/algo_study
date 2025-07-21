package org.example.dfs;

/*
합이 같은 부분집합 (DFS : 아마존 인터뷰)
*/
public class Dfs_006 {
    public static void main(String[] args) {

        char[][] map = new char[][]{{'Y','Y','Y','Y','Y'},
                {'S','Y','S','Y','S'},
                {'Y','Y','Y','Y','Y'},
                {'Y','S','Y','Y','S'},
                {'Y','Y','Y','Y','Y'}};

    }

    static void find(int x, int y, char[][] map, int count) {
        if (count == 7) {
            return;
        }
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};


    }
}