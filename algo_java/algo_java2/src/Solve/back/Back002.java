package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
올림픽
https://www.acmicpc.net/problem/8979
4 2
1 3 0 0
3 0 0 2
4 0 2 0
2 0 2 0

2
*/
public class Back002 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        List<int[]> list = new ArrayList<>();


        for (int i =0 ; i< N; i++) {
            input = br.readLine().split(" ");
            int k = Integer.parseInt(input[0]);
            int g = Integer.parseInt(input[1]);
            int s = Integer.parseInt(input[2]);
            int b = Integer.parseInt(input[3]);

            list.add(new int[]{k, g, s, b});

        }

        list.sort((a, b) -> {
           if (a[1] > b[1]) {
               return -1;
           } else if(a[1] < b[1]) {
               return 1;
           } else {
               if (a[2] > b[2]) {
                   return -1;
               } else if(a[2] < b[2]) {
                   return 1;
               } else {
                   if (a[3] > b[3]) {
                       return -1;
                   } else {
                       return 1;
                   }
               }
           }
        });


        int rank = 1;

        int[] prev = list.get(0);

        if (prev[0] == K) {
            System.out.println(rank);
            return;
        }

        for (int i = 1; i < N; i++) {
            int[] cur = list.get(i);

            if (cur[1] == prev[1] && cur[2] == prev[2] && cur[3] == prev[3]) {
                // 같은 메달 수면 등수 동일

            } else {
                // 등수 갱신
                rank = i + 1;
                prev = cur;

            }

            if (cur[0] == K) {
                System.out.println(rank);
                return;
            }
        }




    }
}


