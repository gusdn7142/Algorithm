package Lv0;

import java.util.Arrays;

public class 배열_두배_만들기_v2 {
    public int[] solution(int[] numbers) {
        int[] newNumbers = new int[numbers.length];

        boolean bool1 = true;
        boolean bool2 = true;

        //numbers[]의 각 원소가 -10000이상 10,000이하인지 체크
        for(int number : numbers){
            if(number<-10000 && 10000<number){
                bool1 = false;
            }
        }

        //numbers[]의 길이가 1이상 1000이하인지 체크
        if(numbers.length<1 && 1000<numbers.length){
            bool2 = false;
        }

        //numbers[] 배열의 2배한 값을 newNumbers[] 배열에 대입
        newNumbers = Arrays.stream(numbers)
                .map(i -> i * 2)   //numbers 배열의 요소들의 값에 2를 곱함.
                .toArray();        //요소들을 배열에 저장

        return newNumbers;
    }
}
