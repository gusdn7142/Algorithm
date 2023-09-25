package Review.Loop;

import java.util.Arrays;

public class 제일_작은_수_제거하기_v1 {
    public int[] solution(int[] arr) {

        //0. 배열 길이가 1인 경우 -1 반환
        if(arr.length == 1){
            int[] result = {-1};
            return result;
        }

        //1. 최소 값 구하기
        int min = arr[0];                       //최소 값: 하나의 값을 기준으로 잡음.
        for(int i=0; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        //2. 최소 값을 제외하고 새로운 배열에 값을 저장
        int index = 0;                        //반복문용 변수
        int[] result = new int[arr.length-1]; //배열길이가 1보다 클 때 가장 작은 수를 뺀 길이의 배열로 선언

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }

            result[index++] = arr[i];
        }

        return result;
    }
}
