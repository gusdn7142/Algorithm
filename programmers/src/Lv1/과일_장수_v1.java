package Lv1;

import java.util.Arrays;

public class 과일_장수_v1 {
    public int solution(int k, int m, int[] score) {
        int result = 0;

        //score[] 배열 오름차순 정렬
        Arrays.sort(score);

        //m개씩 최대한 많은 사과를 파려고 할때, 최대 이익 계산
        int cnt = 0;
        for(int i=score.length-1; i>=0; i--){
            cnt++;
            if(cnt==m){
                result += score[i] * m;
                cnt = 0;
            }
        }

        return result;
    }
}
