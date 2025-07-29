package Solve;

import java.util.*;

/*
프로그래머스 숫자 변환하기
*/
public class Solve006 {

    public int solution(int x1, int y, int n) {
        int answer = -1;

        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[3 * 1000000];
        q.add(new int[]{x1, 0});

        while (!q.isEmpty()) {
            int[] now = q.poll();

            int x = now[0];
            int count = now[1];

            if (x == y) {
                answer = count;
                break;
            }

            if (!visited[x + n] && (x + n <= y)) {
                q.add(new int[]{x + n, count + 1});
                visited[x + n] = true;
            }

            if (!visited[x * 2] && (x * 2 <= y)) {
                q.add(new int[]{x * 2, count + 1});
                visited[x * 2] = true;
            }

            if (!visited[x * 3] && (x * 3 <= y)) {
                q.add(new int[]{x * 3, count + 1});
                visited[x * 3] = true;
            }

        }


        return answer;
    }

}
