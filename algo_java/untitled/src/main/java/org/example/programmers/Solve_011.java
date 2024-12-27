package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;

/*
 * 바탕화면 정리
 * */
public class Solve_011 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(new String [] {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})));
    
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = {};
        int min_r = 51;
        int min_c = 51;
        int max_r = -1;
        int max_c = -1;

        for(int i=0; i<wallpaper.length; i++) {
            for(int j=0; j<wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    min_c = Math.min(min_c,j);
                    min_r = Math.min(min_r,i);
                    max_c = Math.max(max_c,j);
                    max_r = Math.max(max_r,i);
                }
            }
        }

        //System.out.println(min_r + " " + min_c);

        return new int [] {min_r, min_c, max_r + 1, max_c + 1};
    }
}
