package org.example.simulation;

/*
멀리 뛰기

처음에 백트래킹 인줄 알았는데 점화식
* */

public class Simulation_006 {

    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static long solution(int n) {

        long[] arr = new long[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < n + 1; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }

        return arr[n];
    }
}
