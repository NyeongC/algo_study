package org.example.simulation;

/*
유연근무제
* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Simulation_009 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"may", "kein", "kain", "radi"}
                , new int[]{5, 10, 1, 3}
                , new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}
        )));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            hm.put(name[i], yearning[i]);
        }

        return Arrays.stream(photo).mapToInt(row -> Arrays.stream(row)
                        .mapToInt(str -> hm.getOrDefault(str, 0))
                        .sum())
                .toArray();
    }
}
