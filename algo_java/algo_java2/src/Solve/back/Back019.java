package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*

*/
public class Back019 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 1;

        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        int s = 0;
        int e = 1;
        int sum = arr[s] + arr[e];
        s++;

        while (e < n) {
            //System.out.println(sum);
            if(sum == n)
                answer++;

            if (sum < n) {
                if (e + 1 > n){
                    break;
                }
                e++;
                sum += arr[e];
            } else {
                sum -= arr[s];
                s++;
                if(s > n)
                    break;
            }
        }

        System.out.println(answer);
    }

}