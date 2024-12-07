package org.example.programmers;

import java.io.IOException;
import java.util.Arrays;

/*
 * 문자열 내 마음대로 정렬하기
 * */
public class Solve_007 {

    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.deepToString(solution(new String []{"abce", "abcd", "cdx"},2)));
    
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings,((a,b)->{

            // 기본적으로 받은 인덱스만 검사하고 둘이 같을 경우 compareTo 이용
            if(a.charAt(n) != b.charAt(n)){
                return a.charAt(n) - b.charAt(n);
            }

            return a.compareTo(b);

        }));
        return strings;
    }
}
