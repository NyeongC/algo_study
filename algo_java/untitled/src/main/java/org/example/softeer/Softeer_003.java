package org.example.softeer;

import java.io.*;
import java.util.*;

/*
회의실 예약

3 7
grandeur
avante
sonata
sonata 14 16
grandeur 11 12
avante 15 18
sonata 10 11
avante 9 12
grandeur 16 18
avante 12 15
* */

public class Softeer_003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Map<String, int[]> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            hm.put(str, new int[18]);
        }

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            String room = input[0];
            int st = Integer.parseInt(input[1]);
            int ed = Integer.parseInt(input[2]);
            int[] temp = hm.get(room);
            for (int j = st; j < ed; j++) {
                temp[j] = 1;
            }
            hm.put(room, temp);
        }

        Map<String, List<String>> answer = new HashMap<>();

        for (String v : hm.keySet()) {
            int[] temp = hm.get(v);
            answer.put(v, new ArrayList<>());
            int st = 0;
            int ed = 0;
            for (int i = 9; i < 18; i++) {
                if (temp[i] == 0) {
                    if (st == 0) {
                        st = i;
                        ed = i + 1;
                    } else {
                        ed = i + 1;
                    }

                } else {
                    if (st != 0) {
                        String s1 = "" + st;
                        String e1 = "" + ed;
                        if (st < 10) {
                            s1 = "0" + st;
                        }

                        if (ed < 10) {
                            e1 = "0" + ed;
                        }
                        answer.get(v).add(s1 + "-" + e1);
                        st = 0;
                        ed = 0;
                    }
                }
            }
            if (st != 0) {
                String s1 = "" + st;
                String e1 = "" + ed;
                if (st < 10) {
                    s1 = "0" + st;
                }

                if (ed < 10) {
                    e1 = "0" + ed;
                }
                answer.get(v).add(s1 + "-" + e1);
            }
        }
        List<String> nameList = new ArrayList<>();
        for (String v : answer.keySet()) {
            nameList.add(v);
        }

        Collections.sort(nameList);

        for (int i = 0; i < nameList.size(); i++) {
            String name = nameList.get(i);
            if (answer.get(name).isEmpty()) {
                System.out.println("Room " + name + ":");
                System.out.println("Not available");
            } else {
                List<String> temp = answer.get(name);
                System.out.println("Room " + name + ":");
                System.out.println(temp.size() + " available:");
                for (String r : temp) {
                    System.out.println(r);
                }
            }
            if (i + 1 != n) {
                System.out.println("-----");
            }
        }


    }
}
