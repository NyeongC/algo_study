package org.example.programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 *나누어 떨어지는 숫자 배열

 * */
public class Solve_002 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10},5)));
    
    }

    public static int[] solution(int[] arr, int divisor) {


        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if(!list.isEmpty()){
            int [] answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }

        return new int[]{-1};
    }
}
