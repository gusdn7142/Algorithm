package Lv1;

import java.util.PriorityQueue;

public class 명예의_전당_v2 {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();  //"명예의 전당" 저장소,   default 우선순위 : 오름차순 정렬

        int[] minArr = new int[score.length];

        //1. 가수들의 점수를 일차별로 "명예의 전당" priorityQueue에 저장 (만약, 크기가 k를 넘으면 우선순위가 제일 높은 값 제거)
        for(int i=0; i<score.length; i++){
            int num = score[i];         //일차별 가수들의 점수

            priorityQueue.add(num);     //"명예의 전당"에 값 입력
            if(priorityQueue.size() > k){   //"명예의 전당"의 크기가 k를 넘으면
                priorityQueue.poll();       //우선순위가 가장 높은 값 (==가장 작은 값) 제거
            }

            minArr[i] = priorityQueue.peek();  //priorityQueue의 우선순위가 가장 높은 값 (==가장 작은 값) 반환
        }

        return minArr;
    }
}
