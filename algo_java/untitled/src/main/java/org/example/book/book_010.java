package org.example.book;

import java.util.*;

/*
 * 오픈채팅방
 *
 * */
public class book_010 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
    }

    public static String[] solution(String[] record) {
        String[] answer = {};

        Map<String, String> hm = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(String i : record) {
            String [] command = i.split(" ");
            if(command[0].equals("Enter") ||command[0].equals("Change")) {
                hm.put(command[1],command[2]);
            }
        }

        for(String i : record) {
            String [] command = i.split(" ");
            if(command[0].equals("Enter")) {
                list.add(hm.get(command[1]) + "님이 들어왔습니다.");
            } else if(command[0].equals("Leave")) {
                list.add(hm.get(command[1]) + "님이 나갔습니다.");
            }

        }


        return list.stream().toArray(String[]::new);
    }

}
