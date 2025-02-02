package org.example.book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 폰켓몬
 *
 * */
public class book_012 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 3}));
    }

    public static int solution(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));

        return Math.min(set.size(), nums.length / 2);
    }

}
