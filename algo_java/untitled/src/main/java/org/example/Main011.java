package org.example;

import java.io.IOException;

import java.io.*;
import java.util.*;

public class Main011 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int [][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            str = br.readLine().split(" ");
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }


        for(int k=0; k<2; k++){
            str = br.readLine().split(" ");
            int st = Integer.parseInt(str[0]);
            int en = Integer.parseInt(str[1]);
            int [] dokki = new int[]{1,1,1,1,1};
            int index = 0;
            for(int i=st-1; i<en; i++){

                for(int j=0; j<m; j++){
                    if(dokki[index]==1 && arr[i][j]==1){
                        arr[i][j] = 0;
                        dokki[index] = 0;
                    }
                }
                index++;

            }

        }

        int answer = 0;
        // 갯수 세기
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){
                if(arr[i][j]==1)
                    answer++;
            }

        }

        System.out.print(answer);


    }
}
