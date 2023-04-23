package Lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 배열의_유사도_v2 {
    public int solution(String[] s1, String[] s2) {
        int count = 0;

        Set<String> set = new HashSet<>(Arrays.asList(s1));            //s1을 HashSet에 저장
        count = (int)Arrays.stream(s2)                                 //s2의 문자열 원소들을 스트림을 통해 하나씩 조회
                .filter(i -> set.contains(i))                              //HashSet에 s2의 문자열 원소들이 존재하면
                .count();                                                  //개수 카운트

        return count;
    }
}
