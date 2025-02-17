package org.example.hash;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * 롤케이크 자르기
 *
 * */
public class Hash_005 {

    public static void main(String[] args) throws IOException {
        System.out.println(solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }

    public static int solution(int[] topping) {
        int answer = 0;


        Map<Integer, Integer> hm = new HashMap<>();

        for (int i : topping) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        Set<Integer> hs = new HashSet<>();

        for (int i : topping) {
            hs.add(i);
            hm.put(i, hm.getOrDefault(i, 0) - 1);

            if (hm.get(i) == 0) {
                hm.remove(i);
            }

            if (hm.size() == hs.size()) {
                answer++;
            }

        }

        return answer;
    }

}
