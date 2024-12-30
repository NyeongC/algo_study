package org.example.programmers;

import java.io.IOException;
import java.util.*;

/*
 *
 * */
public class Solve_013 {

    public static void main(String[] args) throws IOException {
        System.out.println((solution(new String[]{"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"})));
    
    }

    public static int solution(String[] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        int [][] d = {{1,0},{-1,0},{0,1},{0,-1}};
        int end_x = 0;
        int end_y = 0;
        int l_x = 0;
        int l_y = 0;
        int [] ll = {0,0,0};
        int no_l = 0;
        int no_e = 0;
        Queue<int []> q = new LinkedList<>();

        // 시작점, 도착점, 레버 위치
        for(int i=0; i<maps.length; i++) {
            for(int j=0; j<maps[0].length(); j++) {
                if(maps[i].charAt(j) == 'S') {
                    q.add(new int[]{i,j,0});
                } else if(maps[i].charAt(j) == 'L') {
                    l_x = i;
                    l_y = j;
                } else if(maps[i].charAt(j) == 'E') {
                    end_x = i;
                    end_y = j;
                }
            }
        }
        visited[q.peek()[0]][q.peek()[1]] = true;
        int flag = 0;
        // 레버를 향해
        while(!q.isEmpty()) {
            int [] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            int count = temp[2];
            //System.out.println(temp[0] +" "+ temp[1] + " " + temp[2]);
            for(int i=0; i<4; i++) {
                int nx = d[i][0] + x;
                int ny = d[i][1] + y;

                if(0<= nx && nx< maps.length && 0<= ny && ny <maps[0].length() && !visited[nx][ny]){
                    if(maps[nx].charAt(ny) != 'X'){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx,ny,count+1});
                        if(nx == l_x && ny == l_y) {
                            flag = 1;
                            no_l = 1; // 레버 도착 플래그
                            ll = new int[]{nx,ny,count+1};
                        }
                    }
                }

            }
            if(flag == 1){
                break;
            }


        }

        q = new LinkedList<>();
        if(no_l != 0){
            q.add(ll);
            visited = new boolean[maps.length][maps[0].length()];
            visited[q.peek()[0]][q.peek()[1]] = true;
        }




        // 레버 후 출구를 향해
        flag = 0;
        while(!q.isEmpty()) {
            int [] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            int count = temp[2];

            for(int i=0; i<4; i++) {
                int nx = d[i][0] + x;
                int ny = d[i][1] + y;

                if(0<= nx && nx< maps.length && 0<= ny && ny <maps[0].length()&& !visited[nx][ny]){
                    if(maps[nx].charAt(ny) != 'X'){
                        visited[nx][ny] = true;
                        q.add(new int[]{nx,ny,count+1});
                        if(nx == end_x && ny == end_y) {
                            flag = 1;
                            no_e = 1;
                            ll = new int[]{nx,ny,count+1};
                        }
                    }
                }

            }
            if(flag == 1){
                break;
            }


        }

        System.out.println(no_l + " "+no_e);
        if(no_l == 0 || no_e == 0){
            return -1;
        }


        return ll[2];
    }
}
