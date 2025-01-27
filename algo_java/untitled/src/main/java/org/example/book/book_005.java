package org.example.book;

import java.util.*;
/*
* 짝지어 제거하기
* baabaa -> bbaa -> aa
*
* */
public class book_005 {

    public static void main(String[] args) {

        System.out.println((solution("baabaa")));
    }

    public static int solution(String s)
    {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char temp = s.charAt(i);

            if(!st.isEmpty() && st.peek() == temp) {
                st.pop();
            } else {
                st.push(temp);
            }

        }

        return st.isEmpty() ? 1 : 0 ;
    }

}
