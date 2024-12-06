package org.example.programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 *[PCCP 기출문제] 1번 / 붕대 감기
 * */
public class Solve_004 {

    public static void main(String[] args) throws IOException {
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {
                {2, 10},
                {9, 15},
                {10, 5},
                {11, 5}
        };
        System.out.println(solution(bandage,health,attacks));
    
    }


        public static int solution(int[] bandage, int health, int[][] attacks) {
            int r_heal = health;
            int lastTime = attacks[attacks.length-1][0];
            int a_idx = 0;
            int h_idx = 1;
            for(int i=1; i<=lastTime; i++){
                //System.out.println(r_heal+" "+i);

                // 공격, 공격받으면 회복 스킵
                if(attacks[a_idx][0] == i){
                    r_heal -= attacks[a_idx++][1];
                    if(r_heal < 1)
                        return -1;

                    h_idx = 1;
                    continue;


                }
                r_heal = Math.min(health,r_heal + bandage[1]);

                // 추가 회복 스킬 발동
                if(bandage[0]==h_idx){
                    h_idx = 1;
                    r_heal = Math.min(health,r_heal + bandage[2]);
                }else{
                    h_idx++;
                }

            }




            return r_heal;
        }
    }

