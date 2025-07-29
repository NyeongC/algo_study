package Solve;

import java.util.ArrayList;
import java.util.List;

/*
프로그래머스 연속된 부분 수열의 합
투포인터, Integer.compare(a[1]-a[0], b[1]-b[0]);
*/
public class Solve005 {


    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        List<int[]> list = new ArrayList<>();
        int left = 0;
        int right = 0;
        int len = sequence.length;
        int sum = sequence[0];


        while (left < len && right < len) {
            if (sum == k) {
                list.add(new int[]{left, right});
            }

            if (sum < k) {
                right++;
                if (right < len) {
                    sum += sequence[right];
                }
            } else {
                if (left < len) {
                    sum -= sequence[left];
                }
                left++;
            }
        }

        list.sort((a, b) -> {
            int a1 = a[1] - a[0];
            int b1 = b[1] - b[0];
            if (a1 < b1) {
                return -1;
            } else if (b1 < a1) {
                return 1;
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        answer = list.get(0);


        return answer;
    }


}
