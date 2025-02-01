package org.example.book;

import java.util.*;

/*
 *
 *
 * */
public class book_007 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55},new int[]	{1, 30, 5})));

    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();


        for (int i = 0; i < progresses.length; i++) {
            q.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }

        while (!q.isEmpty()) {
            int first = q.poll();
            int count = 1;
            while (!q.isEmpty() && first >= q.peek()) {
                q.poll();
                count++;
            }
            list.add(count);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
