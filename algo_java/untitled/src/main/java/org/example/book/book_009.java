package org.example.book;

import java.util.HashMap;
import java.util.Map;

/*
 * 할인행사
 *
 * */
public class book_009 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},new String[]{
                "chicken", "apple", "apple", "banana", "rice", "apple",
                "pork", "banana", "pork", "rice", "pot", "banana",
                "apple", "banana"
        }));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wants = new HashMap<>();

        for(int i=0; i<want.length; i++) {
            wants.put(want[i], number[i]);
        }

        for(int i=0; i<discount.length-9; i++){
            Map<String, Integer> temp = new HashMap<>();
            for(int j=i; j<i+10; j++) {
                temp.put(discount[j],temp.getOrDefault(discount[j],0)+1);
            }
            if(temp.equals(wants))
                answer++;
        }

        return answer;
    }

}
