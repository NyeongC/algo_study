package org.example.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String_004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String input = br.readLine();
            if (input == null || input.isEmpty()) continue;

            int length = input.length();
            if (length == 1) {
                System.out.println(input + input);
            } else if (length == 2) {
                System.out.println(input);
            } else {
                System.out.println(input.charAt(0) + "" + input.charAt(length - 1));
            }
        }
    }
}