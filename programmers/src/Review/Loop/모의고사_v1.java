package Review.Loop;

import java.util.ArrayList;
import java.util.List;

public class 모의고사_v1 {
    public int[] solution(int[] answersReal) {

        //0. answers.length만큼의 문제에 대한 1~3번의 답안 초기화
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {2,1,2,3,2,4,2,5};
        int[] answers3 = {3,3,1,1,2,2,4,4,5,5};

        //1. 1~3번이 answers.length만큼의 문제를 맞힌 개수 계산
        int count1 = 0;     //1번 수포자가 맞힌 문제 수
        int count2 = 0;     //2번 수포자가 맞힌 문제 수
        int count3 = 0;     //3번 수포자가 맞힌 문제 수

        int index1 = 1;

        for(int i=0; i<answersReal.length; i++){
            if(answersReal[i] == answers1[i % answers1.length])
                count1++;
            if(answersReal[i] == answers2[i % answers2.length])
                count2++;
            if(answersReal[i] == answers3[i % answers3.length])
                count3++;
        }


        //2. 최대로 많이 맞힌 사람을 배열에 저장 (단, 여러명이면 오름차순으로 정렬)
        int countMax = Math.max(count1, Math.max(count2, count3));
        List<Integer> list = new ArrayList<Integer>();

        if(countMax==count1){
            list.add(1);
        }
        if(countMax==count2){
            list.add(2);
        }
        if(countMax==count3){
            list.add(3);
        }

        int[] result = list.stream()
                .mapToInt(i->i)
                .toArray();

        //System.out.println(Arrays.toString(answers1));
        //System.out.println(Arrays.toString(answers2));
        //System.out.println(Arrays.toString(answers3));

        return result;
    }
}
