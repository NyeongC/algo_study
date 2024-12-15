package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;

/*
 * [PCCE 기출문제] 10번 / 공원
 * */
public class Solve_009 {

    public static void main(String[] args) throws IOException {
        System.out.println(solution(new int[]{5,3,2},new String[][] {
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
        }));
    
    }

    public static int solution(int[] mats, String[][] park) {
        int answer = 0;

        for(int i=0; i< park.length; i++) {
            for(int j=0; j<park[0].length; j++){
                for(int k=0; k<mats.length; k++){
                    if(check(park,i,j,mats[k])){
                        //System.out.println(i+" "+j+" "+mats[k]);
                        answer = Math.max(answer,mats[k]);
                    }
                }
            }

        }
        if(answer == 0){
            return -1;
        }
        return answer;
    }

    public static boolean check(String [][] park, int x, int y, int max){
        boolean flag = false;
        for(int i=x; i< x+max; i++) {
            for(int j=y; j<y+max; j++){
                if(x+max <= park.length && y+max <= park[0].length){
                    if(park[i][j].equals("-1")){
                        flag = true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }

        }
        return flag;
    }
}
