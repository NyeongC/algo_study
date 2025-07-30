package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
N과M (5)
3 1
4 5 2

2
4
5
 */
public class Back007 {

    public static List<List<Integer>> result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        result = new ArrayList<>();
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        input = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        permu(arr, visited, m, new ArrayList<>());


        for (List<Integer> i : result) {
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }

        br.close();
    }

    public static void permu(int[] arr, boolean[] visited
            , int r, List<Integer> current) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current.add(arr[i]);
                permu(arr, visited, r, current);
                visited[i] = false;
                current.remove(current.size() - 1);
            }
        }
    }
}