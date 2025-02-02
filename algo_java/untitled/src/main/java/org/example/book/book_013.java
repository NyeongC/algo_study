package org.example.book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 폰켓몬
 *
 * */
public class book_013 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0};

        Set<String> set = new HashSet<>();

        for(int i=0; i<words.length; i++){

            // 몇번째 사람
            int man = (i+1) % n == 0 ? n : (i+1) % n;

            // 차례
            int num = (int)Math.ceil((i) / n) + 1;

            if(set.contains(words[i]) || i>0 &&
                    (words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1))){
                answer[0] = man;
                answer[1] = num;
                break;
            }

            set.add(words[i]);

        }

        return answer;
    }

}
