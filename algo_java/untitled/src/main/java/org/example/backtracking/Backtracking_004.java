package org.example.backtracking;

/*
 * 로또
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Backtracking_004 {


    static List<Integer> list;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {


            String[] input = br.readLine().split(" ");

            if (input[0].equals("0"))
                break;

            arr = new int[Integer.parseInt(input[0])];
            visited = new boolean[Integer.parseInt(input[0])];
            list = new ArrayList<>();

            for (int i = 1; i < input.length; i++) {
                arr[i - 1] = Integer.parseInt(input[i]);
            }

            dfs(0);
            System.out.println();
        }

        br.close();

    }

    static void dfs(int index) {
        if (list.size() == 6) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int i = index; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(arr[i]);
                dfs(i);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }


    }
}