package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n = str.length();

        Integer [] arr = new Integer[n];
        int target = Integer.parseInt(str);

        for(int i =0; i<n; i++){
            int k = (int)Math.pow(10,n-i-1);
            arr[i] = target / k;
            target = target % k;

        }

        Arrays.sort(arr,(a,b)-> {
            if(b>a)
                return 1;
            else
                return -1;
        });

        for(Integer i : arr)
            System.out.print(i);

    }
}