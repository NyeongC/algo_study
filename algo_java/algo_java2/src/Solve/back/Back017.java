package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
네 번쨰 점

30 20
10 10
10 20

30 10
*/
public class Back017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][2];

        String[] input;
        int x;
        int y;

        for (int i = 0; i < 3; i++) {
            input = br.readLine().split(" ");
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);
            arr[i] = new int[]{x, y};
        }
        x = getPoint(arr[0][0], arr[1][0], arr[2][0]);
        y = getPoint(arr[0][1], arr[1][1], arr[2][1]);

        System.out.println(x + " " + y);


    }

    public static int getPoint(int x, int y, int z) {
        if (x == y) {
            return z;
        } else if (x == z) {
            return y;
        } else {
            return x;
        }
    }

}