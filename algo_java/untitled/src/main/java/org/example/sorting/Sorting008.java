package org.example.sorting;

/*
튜플
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sorting008 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
    }

    public static int[] solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        s = s.substring(2, s.length() - 2);

        ArrayList<ArrayList<Integer>> totalList = new ArrayList<>();

        String[] arr = s.split("\\},\\{");

        for (String temp : arr) {
            String[] temp2 = temp.split(",");
            ArrayList<Integer> list = new ArrayList<>();
            for (String t : temp2) {
                list.add(Integer.parseInt(t));
            }

            totalList.add(list);
        }

        totalList.sort((a, b) -> Integer.compare(a.size(), b.size()));


        Set<Integer> ts = new HashSet<>();

        for (ArrayList<Integer> temp : totalList) {
            for (Integer temp2 : temp) {
                if (!ts.contains(temp2)) {
                    ts.add(temp2);
                    answer.add(temp2);
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
