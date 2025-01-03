package org.example.string;

public class String_001 {
/*
* 크기가 작은 부분문자열
* */
    public int solution(String t, String p) {
        int answer = 0;

        String [] temp = t.split("");
        int l = p.length();


        for(int i=0; i<=t.length()-l; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=i; j<i+l; j++){
                sb.append(temp[j]);
            }
            if(Long.parseLong(sb.toString())<=Long.parseLong(p))
                answer++;

        }



        return answer;
    }
}
