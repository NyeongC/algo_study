package org.example.backjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 푸드 파이트 대회
 * */
public class Main025 {
    public static void main(String[] args) throws IOException {

        System.out.println(solution(new int[]{1, 3, 4, 6}));


    }

    public static String solution(int[] food) {

        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            int temp = food[i];

            for (int j = 1; j < temp; j += 2) {
                list.add(i);
                sb.append(i);
            }
        }
        sb.append(0);

        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }

        return sb.toString();
    }
}