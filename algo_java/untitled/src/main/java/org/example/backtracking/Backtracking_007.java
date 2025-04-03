package org.example.backtracking;

/*
 * 로또
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Backtracking_007 {

    static int[] arr;
    static boolean[] visited;
    static ArrayList<Integer> list;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("0")) {
                break;
            }
            int n = Integer.parseInt(input[0]);
            arr = new int[n + 1];

            for (int i = 1; i < n + 1; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            visited = new boolean[n + 1];
            list = new ArrayList<>();

            dfs(1);
            System.out.println();
        }
        br.close();

    }
    static void dfs(int index) {
        if (list.size() == 6) {
            for (int i : list)
                System.out.print(i+" ");
            System.out.println();
        }

        for (int i = index; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(arr[i]);
                dfs(i);
                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }



    }
}