package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;
/*
* 제일 작은 수 제거하기
 * */
public class Solve_001 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(new int[]{10})));
    
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];

        if(arr.length == 1){
            return new int[] {-1};
        }
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != min){
                answer[idx++] = arr[i];
            }
        }

        return answer;
    }
}
