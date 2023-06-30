package Lv2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스_v1 {

    public int solution(int[] priorities, int location) {
        int result = 0;       //프로세스 우선순위

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  //우선순위 큐 (내림차순 정렬)

        for(int i=0; i<priorities.length; i++){
            pq.add(priorities[i]);
        }

        while(pq.size() > 0){                          //큐의 크기만큼 반복
            for(int i=0; i<priorities.length; i++){    //프로세스 수만큼 반복

                //System.out.println(i + " , " + pq.peek());

                //큐의 값과 프로세스 우선순위가 일치할 경우
                if(pq.peek() == priorities[i]){
                    pq.remove();   //큐에서 값 제거
                    result++;      //프로세스 우선순위 카운트

                    if(i==location){   //i와 찾는 프로세스의 인덱스가 같으면
                        return result;
                    }
                }
            }
        }

        return -1;

    }
}
