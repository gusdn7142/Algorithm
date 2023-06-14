package Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의_전당_v1 {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();    //"명예의 전당" 저장소
        int[] minArr = new int[score.length];

        //1. 가수들의 점수를 일차별로 명예의 전당 list에 저장 후 일차별 최하위 점수를 minArr 배열에 저장
        for(int i=0; i<score.length; i++){
            int num = score[i];         //일차별 가수들의 점수

            if(list.size() < k){   //명예의 전당 list가 비어있으면 일차별 가수들의 점수를 저장
                list.add(num);
            } else {               //명예의 전당 list가 비어있지 않으면 일차별 가수들의 점수를 갱신
                Collections.sort(list);   //list 오름차순 정렬
                if(num > list.get(0)){    //입력받은 점수가 "명예의 전당"의 가장 작은 수보다 크면
                    list.remove(0);       //"명예의 전당"의 값 제거
                    list.add(num);        //"명예의 전당"의 값 추가
                }

            }

            //일차별 최하위 점수를 minArr 배열에 저장
            Collections.sort(list);     //"명예의 전당" list 오름차순 정렬
            minArr[i] = list.get(0);    //list에서 가장 작은 값을 대입

        }

        return minArr;
    }
}
