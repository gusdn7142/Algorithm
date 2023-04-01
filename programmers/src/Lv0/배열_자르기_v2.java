package Lv0;

import java.util.stream.IntStream;

public class 배열_자르기_v2 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] newNumbers = new int[num2-num1+1];
        int index=0;

        boolean bool1 = true;
        boolean bool2 = true;
        boolean bool3 = true;

        //numbers의 길이가 2이상 30이하인지 체크
        if(numbers.length<2 || 30<numbers.length){
            bool1 = false;
        }

        //numbers의 각 원소가 0이상 1000이하인지 체크
        for(int number : numbers){
            if(number<0 || 1000<number){
                bool2 = false;
            }
        }

        //0≤num1 < num2 < numbers의 길이인지 체크
        bool3 = (0>num1) ? false : (num1 >= num2 ? false : (num2 >= numbers.length ? false : true));

        if(bool1 && bool2 && bool3){
            newNumbers = IntStream.rangeClosed(num1, num2)  //num1~num2번째 까지의 수를 배열에 Input
                    .map(i -> numbers[i])
                    .toArray();
        }


        return newNumbers;
    }
}
