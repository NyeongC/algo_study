package org.example.dfs;

import java.util.ArrayList;
import java.util.List;

/*
합이 같은 부분집합 (DFS : 아마존 인터뷰)
*/
public class Dfs_005 {
    public static void main(String[] args) {
        int n = 6;

        int[] arr = new int[]{1, 3, 5, 6, 7, 10};

        List<String> answer = new ArrayList<>();

        dfs(arr, answer, new ArrayList<>(), 0, n, 0);
    }

    static void dfs(int[] arr, List<String> list, List<Integer> current, int count, int n, int index) {
        if (count == n) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int left = 0;
            int right = 0;
            for (int i = 0; i < n; i++) {
                if (current.contains(i)) {
                    left += arr[i];
                    sb.append(arr[i]).append(" ");
                } else {
                    right += arr[i];
                    sb2.append(arr[i]).append(" ");
                }
            }
            if (left == right) {
                System.out.println(sb.toString());
                System.out.println(sb2.toString());
                System.out.println();
            }


            return;
        }
        current.add(index);
        dfs(arr, list, current, count + 1, n, index + 1);
        current.remove(current.size() - 1);
        dfs(arr, list, current, count + 1, n, index + 1);

    }
}
