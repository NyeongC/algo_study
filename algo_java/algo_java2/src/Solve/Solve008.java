package Solve;

import java.util.Stack;

/*
프로그래머스 숫자의 표현
브루트포스
*/
public class Solve008 {

    class Solution {
        public int solution(int n) {
            int answer = 1;

            for (int i = 1; i < n - 1; i++) {
                int sum = i;
                int count = i + 1;
                while (true) {
                    sum += count++;
                    if (sum == n) {
                        answer++;
                        break;
                    }

                    if (sum > n)
                        break;
                }
            }

            return answer;
        }
    }

}
