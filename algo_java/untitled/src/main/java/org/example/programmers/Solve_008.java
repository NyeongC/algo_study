package org.example.programmers;

import java.io.IOException;
import java.util.*;

/*
 *개인정보 수집 유효기간
 * */
public class Solve_008 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution("2022.05.19",new String[] {"A 6", "B 12", "C 3"},new String[] {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"})));
    
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {

        String [] dd = today.split("\\.");
        int y = Integer.parseInt(dd[0]);
        int m = Integer.parseInt(dd[1]);
        int d = Integer.parseInt(dd[2]);
        List<Integer> list = new ArrayList<>();

        // 기간 적재
        Map<String,Integer> hm = new HashMap<>();
        for(String s : terms) {
            String [] temp = s.split(" ");
            hm.put(temp[0],Integer.parseInt(temp[1]) * 28);
        }
        int index = 1;
        for(String s : privacies) {
            String [] temp = s.split(" ");
            String [] dd2 = temp[0].split("\\.");

            int y2 = Integer.parseInt(dd2[0]);
            int m2 = Integer.parseInt(dd2[1]);
            int d2 = Integer.parseInt(dd2[2]);

            int total = ((y-y2)*28*12) + ((m-m2)*28) + (d-d2);
            // 날짜 비교
            if(total >= hm.get(temp[1]))
                list.add(index);
            index++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
