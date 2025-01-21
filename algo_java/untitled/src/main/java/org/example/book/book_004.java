package org.example.book;

import java.util.*;

public class book_004 {

    public static void main(String[] args) {

        System.out.println((solution("LULLLLLLU")));
    }

    public static int solution(String dirs) {

        int x = 0;
        int y = 0;

        // 중복 감지를 위한 Set
        Set<String> s = new HashSet<>();

        // 방향
        Map<Character, int []> location = new HashMap<>();
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('R', new int[]{1, 0});
        location.put('L', new int[]{-1, 0});


        for(int i=0; i<dirs.length(); i++) {
            int [] temp = location.get(dirs.charAt(i));

            int nx = x + temp[0];
            int ny = y + temp[1];

            if(-5<=nx&&nx<=5 && -5<=ny&&ny<=5) {

                s.add(x + " " + y +" " + nx + " " + ny);
                s.add(nx + " " + ny +" " + x + " " + y);

                x = nx;
                y = ny;
            } else {
                continue;
            }


        }

        return s.size() / 2;
    }

}
