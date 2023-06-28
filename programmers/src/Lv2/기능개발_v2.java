package Lv2;

import java.util.Arrays;

public class 기능개발_v2 {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] releaseDay = new int[100];    //배포일자별 기능 수 저장
        int day = 0;                        //현재 기능의 배포일
        int beforeDay = 100;                //이 전 기능의 배포일

        //1. 배포일자별 기능 수를 releaseDay 배열에 삽입
        for(int i=0; i<progresses.length; i++){
            day++;

            while(progresses[i] < 100){
                progresses[i] += speeds[i];
                day++;  //현재 기능의 배포일 카운트
            }

            if(i>0 && beforeDay > day){  //이 전 배포일이 현 배포일보다 크면
                day = beforeDay;
            }

            releaseDay[day]++;            //배포일자별 기능 수 저장
            beforeDay = day;              //이 전 배포일 갱신
            day = 0;                      //현재 배포일 갱신
        }


        //2. 배포별 기능 수가 1이상인 경우에만 result[] 배열에 저장
        int result[] = Arrays.stream(releaseDay)
                .filter(i -> i != 0)            //배포 일자별 기능 수가 0이면 제외
                .toArray();

        return result;
    }
}
