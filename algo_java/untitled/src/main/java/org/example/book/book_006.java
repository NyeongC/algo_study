package org.example.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/*
 * 요세푸스 문제
 *
 * */
public class book_006 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        ArrayDeque<Integer> q = new ArrayDeque<>();

        String[] temp = br.readLine().split(" ");

        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);

        for (int i = 1; i <= n; i++) {
            q.addLast(i);
        }

        while (!q.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                int num = q.pollFirst();
                q.addLast(num);
            }
            list.add(q.pollFirst());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i) + ", ");
        }
        sb.append(list.get(list.size() - 1) + ">");

        System.out.println(sb.toString());

    }

}
