package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
모바일 광고 입찰
https://www.acmicpc.net/problem/31246
3 2
10 30
21 19
10 12
2
* */
public class Back001 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<>();
        int a, b;
        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            int num = b - a;

            list.add(num);
        }
        Collections.sort(list);

        System.out.println(Math.max(0, list.get(k - 1)));

    }
}

