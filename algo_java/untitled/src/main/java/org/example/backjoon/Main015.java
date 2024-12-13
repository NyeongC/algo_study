package org.example.backjoon;

import java.util.*;
import java.io.*;

/*
* 10866 덱
* */
public class Main015 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> dq = new ArrayDeque<Integer>();

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(n-->0) {
            String [] input = br.readLine().split(" ");
            switch(input[0]) {
                case "push_front" :
                    dq.addFirst(Integer.parseInt(input[1]));
                    break;
                case "push_back" :
                    dq.addLast(Integer.parseInt(input[1]));
                    break;
                case "pop_front" :
                    if(dq.isEmpty()){
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(dq.pollFirst()).append("\n");
                    }
                    break;
                case "pop_back" :
                    if(dq.isEmpty()){
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(dq.pollLast()).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty" :
                    if(dq.isEmpty()){
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "front" :
                    if(dq.isEmpty()){
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(dq.peekFirst()).append("\n");
                    }
                    break;
                case "back" :
                    if(dq.isEmpty()){
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(dq.peekLast()).append("\n");
                    }
                    break;
            }
        }

        System.out.print(sb.toString());

    }
}