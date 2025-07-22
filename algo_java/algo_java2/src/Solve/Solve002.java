package Solve;

import java.util.ArrayList;
import java.util.List;
/*
프로그래머스 소수 만들기
조합 + 소수판별(제곱근)
*/
public class Solve002 {

    List<Integer> result;

    public int solution(int[] nums) {
        int answer = 0;

        result = new ArrayList<>();

        combi(nums, 0, new ArrayList<>());

        for (int i : result) {
            //System.out.println(i +" " + isPrime(i));
            if(isPrime(i))
                answer++;
        }

        return answer;
    }

    public void combi(int[] nums, int index, List<Integer> current) {
        if (current.size() == 3) {
            int sum = 0;
            for (int i : current) {
                sum += i;
            }
            result.add(sum);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            combi(nums, i + 1, current);
            current.remove(current.size() - 1);
        }

    }

    boolean isPrime(int n) {
        boolean answer = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return answer;
    }
}
