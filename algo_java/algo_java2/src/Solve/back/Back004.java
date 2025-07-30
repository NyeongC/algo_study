package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

 */
public class Back004 {

    public static class Man {
        int g;
        int y;
        int s;
        String n;

        public Man(int g, int y, int s, String n) {
            this.g = g;
            this.y = y;
            this.s = s;
            this.n = n;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Man> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            int g = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);
            int s = Integer.parseInt(input[3]);

            list.add(new Man(g,y,s,input[0]));

        }

        list.sort((a, b) -> {

            if (a.g == b.g) {
                if (a.y == b.y) {
                    if(a.s == b.s) {
                        return a.n.compareTo(b.n);
                    }
                    return b.s - a.s;
                }
                return a.y - b.y;
            }
            return b.g - a.g;
        });

        for(Man i : list) {
            System.out.println(i.n);
        }

        br.close();

    }
}


