package Lv1;

import java.util.ArrayList;
import java.util.List;

public class 모의고사_v1 {
    public int[] solution(int[] answersReal) {

        //0. answers.length만큼의 문제에 대한 1번의 답안
        int[] answers1 = new int[answersReal.length];
        int index1 = 1;

        for(int i=0; i<answers1.length; i++){
            answers1[i] = index1++;
            if(index1 > 5)
                index1 = 1;
        }

        //0. answers.length만큼의 문제에 대한 2번의 답안
        int[] answers2 = new int[answersReal.length];
        int index2 = 1;

        for(int i=0; i<answers2.length; i++){

            if(i%2==0){  //짝수번째는 2
                answers2[i] = 2;
            }
            else {  //홀수번쨰는 1..3..4..5..1
                answers2[i] = index2;
                index2++;

                if(index2 == 2)
                    index2++;
                else if(index2 > 5)
                    index2 = 1;
            }
        }

        //0. answers.length만큼의 문제에 대한 3번의 답안
        int[] answers3 = new int[answersReal.length];
        int index3 = 3;

        for(int i=0; i<answers3.length; i+=2){
            answers3[i] = index3;
            if(i+1>=answers3.length)
                break;
            answers3[i+1] = index3;

            if(index3==2)
                index3 = 4;
            else if(index3==3)
                index3 = 1;
            else if(index3==5)
                index3 = 3;
            else
                index3++;
        }

        //1. 문제마다 맞힌 사람의 수를 카운트
        int count1 = 0;     //1번 수포자가 맞힌 문제 수
        int count2 = 0;     //2번 수포자가 맞힌 문제 수
        int count3 = 0;     //3번 수포자가 맞힌 문제 수
        int countMax = 0;

        for(int i=0; i<answersReal.length; i++){

            //1~3번 수포자가 맞힌 문제수 카운트
            if(answersReal[i] == answers1[i])
                count1++;
            if(answersReal[i] == answers2[i])
                count2++;
            if(answersReal[i] == answers3[i])
                count3++;

            //1~3번 수포자가 맞힌 문제의 최대 수
            if(countMax < count1){
                countMax = count1;
            }
            if(countMax < count2){
                countMax = count2;
            }
            if(countMax < count3){
                countMax = count3;
            }
        }


        //2. 최대로 많이 맞힌 사람을 배열에 저장 (단, 여러명이면 오름차순으로 정렬)
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
