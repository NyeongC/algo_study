package org.example.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sorting001 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String [] arr = new String[n];


        for(int i=0; i<n; i++) {
            arr[i] = br.readLine() + " " + (i+1);
        }

        Arrays.sort(arr, (a,b)->{
            int n1 = Integer.parseInt(a.split(" ")[0]);
            int n2 = Integer.parseInt(b.split(" ")[0]);

            int compareValue = Integer.compare(n1,n2);

            if(compareValue == 0) {
                int nn1 = Integer.parseInt(a.split(" ")[2]);
                int nn2 = Integer.parseInt(a.split(" ")[2]);
                return Integer.compare(nn1,nn2);
            }

            return compareValue;


        });

        for(String i : arr){
            String [] temp = i.split(" ");
            System.out.println(temp[0]+" "+ temp[1]);
        }



    }
}
