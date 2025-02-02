package org.example.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

/*
 * 베스트 앨범
 *
 * */
public class Hash_003 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"classic", "pop", "classic", "classic", "pop"}
                , new int[]{500, 600, 150, 800, 2500})));
    }

    public static int[] solution(String[] genres, int[] plays) {

        Map<String, ArrayList<int[]>> genreMap = new HashMap<>();
        Map<String, Integer> playMap = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            if (!genreMap.containsKey(genre)) {
                genreMap.put(genre, new ArrayList<>());
                playMap.put(genre, 0);
            }

            genreMap.get(genre).add(new int[]{i, play});
            playMap.put(genre, playMap.get(genre) + play);

        }


        Stream<Map.Entry<String, Integer>> sortedGenre = playMap.entrySet().stream()
                .sorted((a, b) -> {
                    return Integer.compare(b.getValue(), a.getValue());
                });


        sortedGenre.forEach(entry -> {
            Stream<int[]> sortedSongs = genreMap.get(entry.getKey()).stream()
                    .sorted((a, b) -> Integer.compare(b[1], a[1]))
                    .limit(2);

            sortedSongs.forEach(song -> answer.add(song[0]));
        });


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}
