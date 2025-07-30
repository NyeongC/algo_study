package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
N과M (6)
4 2
9 8 7 1

1 7
1 8
1 9
7 8
7 9
8 9
 */
public class Back008 {

    public static List<List<Integer>> result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        result = new ArrayList<>();
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];

        input = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        combi(arr, m, new ArrayList<>(), 0);


        for (List<Integer> i : result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        br.close();
    }

    public static void combi(int[] arr, int r, List<Integer> current, int index) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            current.add(arr[i]);
            combi(arr, r, current, i + 1);
            current.remove(current.size() - 1);
        }
    }
}