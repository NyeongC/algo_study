package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
백준 덩치 브루트포스
 */
public class Back005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input;
        List<int[] > list = new ArrayList<>();
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            list.add(new int[]{x, y});
        }

        for (int i = 0; i < n; i++) {
            int x1 = list.get(i)[0];
            int y1 = list.get(i)[1];
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                int x2 = list.get(j)[0];
                int y2 = list.get(j)[1];

                if (x1 < x2 && y1 < y2) {
                    count++;
                }
            }
            answer[i] = count;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }



    }
}
