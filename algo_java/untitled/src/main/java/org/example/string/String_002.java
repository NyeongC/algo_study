package org.example.string;

public class String_002 {
    /*
     * 문자열 나누기
     * */
    public int solution(String s) {
        int answer = 0;
        int x_count = 0;
        int other_count = 0;
        char x = ' ';
        for (int i = 0; i < s.length(); i++) {


            if (x_count == 0 && other_count == 0) {
                x = s.charAt(i);
                x_count++;
            } else {
                if (x == s.charAt(i)) {
                    x_count++;
                } else {
                    other_count++;
                }
            }
            if (x_count == other_count) {
                answer++;
                x_count = 0;
                other_count = 0;

            }

        }
        if (x_count != 0 || other_count != 0) {
            answer++;
        }


        return answer;
    }
}
