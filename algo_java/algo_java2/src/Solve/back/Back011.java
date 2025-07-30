package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
구간 합 구하기 4
5 3
5 4 3 2 1
1 3
2 4
5 5

12
9
1
 */
public class Back011 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n + 1];
        input = br.readLine().split(" ");
        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(input[i -1]);
        }

        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int e = Integer.parseInt(input[1]);
            sb.append(arr[e] - arr[s -1]).append("\n");
        }

        System.out.print(sb.toString());
    }
}