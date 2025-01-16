package org.example.book;

import java.util.*;

public class book_002 {

    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        int[] answer = {};

        int [][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // score
        int [] score = new int[3];

        for(int i=0; i<3; i++){
            for(int j=0; j<answers.length; j++){
                if(answers[j] == pattern[i][j%pattern[i].length])
                    score[i]++;
            }
        }
        
        int max = Arrays.stream(score).max().getAsInt();

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<3; i++){
            if(max == score[i])
                list.add(i+1);
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(answer));
    }

}
