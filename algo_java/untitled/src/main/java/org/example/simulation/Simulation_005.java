package org.example.simulation;

/*
캐릭터의 좌표
* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Simulation_005 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[]{0, 0};
        int x = board[1] / 2;
        int y = board[0] / 2;
        Map<String, int[]> hm = new HashMap<>();

        hm.put("up", new int[]{0, 1});
        hm.put("down", new int[]{0, -1});
        hm.put("left", new int[]{-1, 0});
        hm.put("right", new int[]{1, 0});

        for (String s : keyinput) {
            int[] dir = hm.get(s);

            int dx = dir[1] + answer[1];
            int dy = dir[0] + answer[0];

            if (-x <= dx && dx <= x && -y <= dy && dy <= y) {
                answer = new int[]{dy, dx};
            }
        }

        return answer;
    }
}
