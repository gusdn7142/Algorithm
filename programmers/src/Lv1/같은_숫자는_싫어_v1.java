package Lv1;

import java.util.ArrayList;

public class 같은_숫자는_싫어_v1 {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        //1. arr[] 배열에서 연속되는 수는 하나만 남기고 list에 삽입
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1])
                list.add(arr[i+1]);
        }

        //2. list에 담긴 값들을 result 배열에 삽입
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }
}
