package Solve;

import java.util.Stack;

/*
프로그래머스 뒤에 있는 큰 수 찾기
스택
*/
public class Solve008 {

    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Stack<Integer> st = new Stack<>();

        st.add(0);
        for (int i = 0; i < len; i++) {
            while (!st.isEmpty() && numbers[st.peek()] < numbers[i]) {
                answer[st.pop()] = numbers[i];
            }
            st.add(i);
        }

        while(!st.isEmpty()) {
            answer[st.pop()] = -1;
        }

        return answer;
    }

}
