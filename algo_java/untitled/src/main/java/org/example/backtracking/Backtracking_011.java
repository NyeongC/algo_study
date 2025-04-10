package org.example.backtracking;

/*
 * 치킨 배달
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Backtracking_011 {

    static List<List<Integer>> totalList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        totalList = new ArrayList<>();

        List<int[]> hList = new ArrayList<>();
        List<int[]> cList = new ArrayList<>();

        int[][] map = new int[n][n];

        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                if (in[j].equals("1")){
                    hList.add(new int[]{i, j});
                } else if (in[j].equals("2")) {
                    cList.add(new int[]{i, j});
                }
            }
        }

        combi(cList, m, new ArrayList<>(), 0);
        int answer = 9999999;
        for(List<Integer> spot : totalList) {
            int total = 0;
            for(int[] house : hList) {
                int temp = 999999;
                for(int i : spot) {
                    int d = Math.abs(cList.get(i)[1] - house[1]) + Math.abs(cList.get(i)[0] - house[0]);
                    temp = Math.min(d, temp);
                    //System.out.println(d);
                }
                total += temp;
            }
            answer = Math.min(total, answer);


        }

        System.out.print(answer);

    }

    static void combi(List<int[]> cList, int m, List<Integer> current, int index) {
        if (current.size() == m) {

            totalList.add(new ArrayList<>(current));


            return;
        }

        for (int i = index; i < cList.size(); i++) {
            current.add(i);
            combi(cList, m, current, i + 1);
            current.remove(current.size() - 1);
        }

    }
}
