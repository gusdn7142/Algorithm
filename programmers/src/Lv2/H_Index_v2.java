package Lv2;

import java.util.Arrays;

public class H_Index_v2 {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        //1. h편 이상 인용되었을때 h의 최댓값 계산
        int max = 0;   //논문의 최대 인용횟수 종합
        for(int i = citations.length-1; i > -1; i--){
            int temp = Math.min(citations[i], citations.length - i);  //(논문당 인용횟수,  h = citations.length - i)
            if(max < temp) {
                max = temp;
            }
        }

        return max;

    }
}
