package Lv2;

import java.util.ArrayList;
import java.util.List;

public class 영어_끝말잇기_v1 {
    public int[] solution(int n, String[] words) {

        int[] result = new int[2];   //[탈락한 사람의 번호,  탈락 순번]
        List<String> list = new ArrayList<>();

        //n명이 words.length길이 만큼 끝말잇기를 진행할떄 탈락한 사람과 순번을 구하시오.
        int index = 0;
        int turn = 1;    //게임의 순번

        for(int i=0; i<words.length; i++){
            index++;
            String word = words[i];

            //탈락 조건1 확인 : 이 전에 등장한 단어인지 체크
            if(list.contains(word)){
                result[0] = (i % n)+1;   //탈락한 사람의 번호 저장
                result[1] = turn;        //탈락한 게임의 번호 저장
                //System.out.println(i);
                //System.out.println(result[1]);
                break;
            }

            //탈락 조건2 확인 : 앞 사람이 말한 단어의 마지막 글자로 시작하는지 체크
            if(i > 0){
                String bword = words[i-1];
                String last = bword.substring(bword.length()-1);
                String first = word.substring(0, 1);

                if(!last.equals(first)){
                    result[0] = (i % n)+1;   //탈락한 사람의 번호 저장
                    result[1] = turn;        //탈락한 게임의 번호 저장
                    //System.out.println(i+1);
                    //System.out.println(result[1]);
                    break;
                }
            }

            //끝말잇기 단어를 list에 삽입
            list.add(word);

            if(index==n){
                turn++;     //게임의 순번 증가
                index=0;
            }
        }

        return result;
    }
}
