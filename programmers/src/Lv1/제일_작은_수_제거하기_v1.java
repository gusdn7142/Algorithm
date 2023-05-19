package Lv1;

import java.util.Arrays;

public class 제일_작은_수_제거하기_v1 {
    public int[] solution(int[] arr) {
        int[] result;
        int[] temp = new int[arr.length];
        int index = 0;

        //1. arr[] 배열의 최소값 찾기
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int minValue = temp[0];

        //2. arr[] 배열에서 최소값을 제거한 새로운 배열 생성
        if(arr.length > 1){
            result = new int[arr.length-1];
            for(int i=0; i<arr.length; i++){
                if(minValue==arr[i]) continue;
                result[index++] = arr[i];
            }
        } else {
            result = new int[1];
            result[index] = -1;
        }

        return result;
    }

}
