package org.example.book;

import java.util.*;

/*
 * 다단계 칫솔 판매
 *
 * */
public class book_011 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"}
        , new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"}
                ,new String[]{"young", "john", "tod", "emily", "mary"},new int[]{12, 4, 2, 5, 10})));
    }

    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

        Map<String, Integer> total = new HashMap<>();
        Map<String, String> parent = new HashMap<>();

        // 부모관계 설정
        for(int i=0; i<enroll.length; i++) {
            parent.put(enroll[i], referral[i]);
        }

        // 돈 계산
        for(int i=0; i<seller.length; i++) {

            String name = seller[i];

            // 개당 100원
            int money = amount[i] * 100;

            while(money > 0 && !name.equals("-")) {
                total.put(name, total.getOrDefault(name, 0) + money - (money / 10));
                name = parent.get(name);
                money = money / 10;
            }

        }

        int [] answer = new int[enroll.length];

        for(int i=0; i<enroll.length; i++) {
            answer[i] = total.getOrDefault(enroll[i],0);
        }

        return answer;
    }

}
