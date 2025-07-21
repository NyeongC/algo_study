package Solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solve001 {

    static int[] arr;
    static boolean[] visited;
    static List<List<Integer>> result;

    public static void main(String[] args) {
        arr = new int[] {1, 2, 3, 4};
        visited = new boolean[4];
        result = new ArrayList<>();
        permu(0, new ArrayList<>());
        for (List<Integer> i : result) {
            for (int index : i) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    static void permu(int index, List<Integer> current) {
        if (current.size() == 4) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (!visited[i]) {
                current.add(i + 1);
                visited[i] = true;
                permu(index, current);
                current.remove(current.size() - 1);
                visited[i] = false;
            }
        }


    }
}
