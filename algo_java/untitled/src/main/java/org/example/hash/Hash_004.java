package org.example.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

/*
 * 인사성 밝은 곰곰이
 *
 * */
public class Hash_004 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> s = new HashSet<>();

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n-- > 0) {

            String input = br.readLine();

            if (input.equals("ENTER")) {
                count += s.size();
                s = new HashSet<>();
            } else {
                s.add(input);
            }

        }

        count += s.size();

        System.out.println(count);


    }

}
