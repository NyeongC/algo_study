package org.example.book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class book_001 {

    public static void main(String[] args) {
        int [] arr = {5,0,2,7};

        Set<Integer> s = new HashSet<>();

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                s.add(arr[i] + arr[j]);
            }
        }

        int [] result = s.stream().sorted().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(result));


    }

}
