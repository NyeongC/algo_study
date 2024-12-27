package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 공원 산책
 * ["OSO","OOO","OXO","OOO"]	["E 2","S 3","W 1"]	[0,0]
 * */
public class Solve_010 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(new String [] {"OSO", "OOO", "OXO", "OOO"},new String [] {"E 2", "S 3", "W 1"})));
    
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int [] nx = {0,0,1,-1};
        int [] ny = {1,-1,0,0};

        int x = 0;
        int y = 0;

        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[0].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    x = i;
                    y = j;
                }
            }
        }

        Map<String,Integer> hm = new HashMap<>();
        hm.put("E",0);
        hm.put("W",1);
        hm.put("S",2);
        hm.put("N",3);


        for(String s : routes) {
            String [] temp = s.split(" ");
            int flag = 0;
            int d = hm.get(temp[0]);
            int num = Integer.parseInt(temp[1]);
            for(int i=1; i<=num; i++) {
                int dx = x + nx[d] * i;
                int dy = y + ny[d] * i;

                if(!(0<= dx && dx<park.length && 0<= dy && dy <park[0].length())){
                    flag = 1;
                    break;
                }

                if(park[dx].charAt(dy)=='X')
                    flag = 1;
            }
            if(flag == 0){
                x = x + nx[d] * num;
                y = y + ny[d] * num;
            }

        }
        System.out.println(x +" "+ y);

        return new int []{x,y};
    }
}
