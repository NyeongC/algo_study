package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 이중우선순위큐
 * */
public class Solve_015 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));

    }

    public static int[] solution(String[] operations) {
        int[] answer = {};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());


        for (int i = 0; i < operations.length; i++) {
            String[] command = operations[i].split(" ");
            if (command[0].equals("I")) {
                minHeap.add(Integer.parseInt(command[1]));
                maxHeap.add(Integer.parseInt(command[1]));
            } else {
                int com = Integer.parseInt(command[1]);
                if (com == 1) {
                    if (!maxHeap.isEmpty()) {
                        int num = maxHeap.poll();
                        minHeap.remove(num);
                    }
                } else if (com == -1) {
                    if (!minHeap.isEmpty()) {
                        int num = minHeap.poll();
                        maxHeap.remove(num);
                    }

                }
            }
        }

        answer = new int[]{0, 0};
        if (maxHeap.size() > 0) {
            answer[0] = maxHeap.poll();
            answer[1] = minHeap.poll();
        }


        return answer;
    }
}
