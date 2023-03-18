package Lv0;

import java.util.Arrays;

public class 최댓값_만들기_v1 {
    public int solution(int[] numbers) {
        int result = 0;
        boolean bool1 = true;  //numbers의 각 원소가 0이상 10,000이하인지 체크하는 boolean 변수
        boolean bool2 = true;  //numbers의 길이가 2이상 100이하인지 체크하는 boolean 변수

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<0 && 10000<numbers[i]){
                bool1 = false;
            }
        }
        int length = numbers.length;
        if(length<2 && 100<length){
            bool2 = false;
        }


        if(bool1 && bool2){
            Arrays.sort(numbers);                           //오름차순 정렬
            result = numbers[length-1] * numbers[length-2]; //2개의 원소 곱의 최댓값 계산
        }

        return result;
    }
}
