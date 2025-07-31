package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
5
10 20 30 40 50
5
1 3
2 4
3 5
1 5
4 4

*/
public class Back016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            arr[i + 1] = arr[i + 1] + arr[i];
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int e = Integer.parseInt(input[1]);

            if (s - 2 < 0) {
                sb.append(arr[e - 1]).append("\n");
            } else {
                sb.append(arr[e - 1] - arr[s - 2]).append("\n");
            }


        }

        System.out.print(sb.toString());

    }
}