package Solve;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
프로그래머스 소수 찾기
순열 + 중복제거(집합) + 소수판별(제곱근)
*/
public class Solve003 {


    class Solution {

        List<Integer> list;
        boolean[] visited;

        public int solution(String numbers) {
            int answer = 0;
            list = new ArrayList<>();
            String[] nums = numbers.split("");
            visited = new boolean[nums.length];


            for (int i = 1; i <= nums.length; i++) {
                permu(nums, i, 0, new ArrayList<>());
            }

            Set<Integer> hs = new HashSet<>();

            for (int i : list) {
                hs.add(i);
            }

            for (int i : hs) {
                if (isPrime(i))
                    answer++;
            }

            return answer;
        }

        public boolean isPrime(int n) {
            if (n <= 1)
                return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public void permu(String[] nums, int c, int index, List<String> current) {
            if (c == index) {

                StringBuilder sb = new StringBuilder();
                for (String t : current) {
                    sb.append(t);
                }
                list.add(Integer.parseInt(sb.toString()));
            }

            for (int i = 0; i < nums.length; i++) {
                if (!visited[i]) {
                    current.add(nums[i]);
                    visited[i] = true;
                    permu(nums, c, index + 1, current);
                    current.remove(current.size() - 1);
                    visited[i] = false;

                }
            }


        }


    }
}
