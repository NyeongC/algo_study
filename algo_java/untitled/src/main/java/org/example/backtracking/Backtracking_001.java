package org.example.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Backtracking_001 {
    static int n;
    static ArrayList<ArrayList<Integer>> result;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        result = new ArrayList<>();

        n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);


        backtrack(0, new ArrayList<>());

        if (k > result.size()) {
            System.out.println("-1");
        } else {
            System.out.println(result.get(k - 1).stream().map(String::valueOf).collect(Collectors.joining("+")));
        }



    }

    static void backtrack(int sum, ArrayList<Integer> list) {

        if (sum == n) {
            result.add(list);
            return;
        }

        for (int i = 1; i <= 3; i++) {


            if (sum + i <= n) {
                ArrayList<Integer> temp = new ArrayList<>(list);
                temp.add(i);
                backtrack(sum + i, temp);
                temp.remove(temp.size()-1);
            }

        }


    }


}
