package org.example.backtracking;

/*
 * 모든 순열
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Backtracking_010 {

    static List<List<Integer>> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        answer = new ArrayList<>();

        permu(n, new ArrayList<>(), new boolean[n]);

        for(List<Integer> list : answer) {
            for (int i = 0; i < n; i++) {
                System.out.print(list.get(i) +" ");
            }
            System.out.println();
        }


    }

    static void permu(int n, List<Integer> list, boolean[] visited) {
        if (list.size() == n) {
            answer.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                list.add(i + 1);
                visited[i] = true;
                permu(n, list, visited);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }

    }
}
