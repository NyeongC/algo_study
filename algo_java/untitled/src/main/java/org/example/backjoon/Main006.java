package org.example.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 제로
public class Main006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();
        int temp = 0;
        while(n-- > 0){
            temp = Integer.parseInt(br.readLine());
            if(temp == 0) {
                s.pop();
            } else{
                s.add(temp);
            }

        }
        int answer = 0;
        while(!s.isEmpty()){
            answer += s.pop();
        }

        System.out.print(answer);




    }
}