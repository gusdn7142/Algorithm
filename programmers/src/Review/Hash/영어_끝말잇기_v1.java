package Review.Hash;

import java.util.HashSet;

public class 영어_끝말잇기_v1 {
    public int[] solution(int n, String[] words) {
        int[] result = {0, 0};  //[탈락한 사람의 번호, 탈락 차례]
        char chEnd = words[0].charAt(words[0].length() - 1);  //첫 단어의 마지막 글자
        char chStart;  //다음에 시작할 글자

        HashSet<String> set = new HashSet<>();
        set.add(words[0]);   //처음 단어 입력

        //n명이 words.length길이 만큼 끝말잇기를 진행할떄 탈락한 사람과 순번을 구하시오.
        for (int i = 1; i < words.length; i++) {

            chStart = words[i].charAt(0);   //다음에 시작할 글자
            set.add(words[i]);               //set에 끝말잇기 단어 입력

            if (chEnd != chStart || set.size() != i + 1) {   //이 전 단어의 마지막 글자와 시작 글자가 다르거나 or 중복된 단어이기 때문에 set에 단어가 입력되지 않았으면
                result[0] = (i % n) + 1;  //탈락한 사람의 번호 저장
                result[1] = (i / n) + 1;  //탈락한 순서 저장
                break;
            }

            chEnd = words[i].charAt(words[i].length() - 1);    //첫 단어의 마지막 글자 갱신
        }
        
        return result;
    }
}
