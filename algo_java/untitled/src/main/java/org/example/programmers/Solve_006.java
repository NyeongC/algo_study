package org.example.programmers;

import java.io.IOException;
import java.util.*;

/*
 * [PCCE 기출문제] 10번 / 데이터 분석
 * */
public class Solve_006 {

    public static void main(String[] args) throws IOException {

        int[][] data = new int[][] {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}
        };
        System.out.println(Arrays.deepToString(solution(data,"date",20300501,"remain")));
    
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        // 정렬 기준 key,value 미리 선정
        Map<String, Integer> m = new HashMap<>();
        m.put("code",0);
        m.put("date",1);
        m.put("maximum",2);
        m.put("remain",3);

        List<int[]> list = new ArrayList<>();

        // 선별작업
        for(int[] i : data){
            //System.out.println(i[m.get(ext)]);
            if(i[m.get(ext)] < val_ext){
                list.add(i);
            }
        }

        // 기준에 따라 정렬
        list.sort((a,b)->{
            return a[m.get(sort_by)] - b[m.get(sort_by)];
        });

        int [][] answer = new int[list.size()][4];

        // 배열 적재
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }


        return answer;
    }
}
