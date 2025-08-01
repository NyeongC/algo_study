package Solve.back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
3
1 0
5
4 2
1 2 3 4
6 0
1 1 9 1 1 1
*/
public class Back020 {

    public static class Data {
        int index;
        int prior;

        public Data(int index, int prior) {
            this.index = index;
            this.prior = prior;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(T-- > 0) {
            input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            input = br.readLine().split(" ");
            int count = 0;

            Queue<Data> q = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                q.add(new Data(i, Integer.parseInt(input[i])));
            }

            while(!q.isEmpty()) {
                Data now = q.poll();

                boolean first = true;

                for(Data temp : q) {
                    if (now.prior < temp.prior)
                        first = false;
                }

                if(first) {
                    count++;
                    if(now.index == m) {
                        sb.append(count).append("\n");
                    }
                } else {
                    q.add(now);
                }




            }

        }
        System.out.println(sb.toString());
    }

}
