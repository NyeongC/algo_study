package org.example.softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
스마트 물류

입력예제2
20 2
HHHHHPPPPPHPHPHPHHHP

출력예제2

7
* */

public class Softeer_002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        input = br.readLine().split("");
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {

            if (input[i].equals("P")) {
                for (int j = i - k; j <= i + k; j++) {
                    if (j < 0 || j >= n)
                        continue;
                    if (input[j].equals("H")) {
                        if (!visited[j] && !visited[i]) {
                            //System.out.println(i + " " + j);
                            visited[j] = true;
                            visited[i] = true;
                            count++;
                        }
                    }
                }
            }


        }

        System.out.println(count);
    }
}
