package org.example.stack;

import java.util.Arrays;
import java.util.Stack;

/*
* 뒤에 있는 큰 수 찾기
* */

public class Stack_001 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{9, 1, 5, 3, 6, 2})));
    }

    public static int[] solution(int[] numbers) {

        int n = numbers.length;

        int[] answer = new int[n];

        Stack<Integer> st = new Stack<>();

        st.push(0);

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && numbers[st.peek()] < numbers[i]) {
                answer[st.pop()] = numbers[i];
            }

            st.push(i);

        }

        while (!st.isEmpty()) {
            answer[st.pop()] = -1;
        }

        return answer;
    }


}
