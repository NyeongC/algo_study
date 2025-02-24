package org.example.simulation;

/*
유연근무제
* */

public class Simulation_008 {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {700, 800, 1100},new int[][]{{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}}, 5));
    }

    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;


        for (int i = 0; i < schedules.length; i++) {
            int schedule = schedules[i];
            int flag = 0;
            int s = startday;
            for (int time : timelogs[i]) {
                int day = s++ % 7;
                if (day == 6 || day == 0)
                    continue;

                int a1 = schedule / 100;
                int a2 = schedule % 100;

                int b1 = time / 100;
                int b2 = time % 100;

                int c1 = b1 - a1;
                int c2 = b2 - a2;


                if (c1 * 60 + c2 > 10) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                answer++;
            }
        }


        return answer;
    }
}
