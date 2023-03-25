package Lv0;

import java.util.stream.IntStream;

public class 배열_뒤집기_v2 {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];

        boolean bool1 = true;
        boolean bool2 = true;

        //num_list[]의 각 원소가 1이상 10,00이하인지 체크
        for(int num : num_list){
            if(num<1 && 1000<num){
                bool1 = false;
            }
        }

        //num_list[]의 길이가 1이상 1000이하인지 체크
        if(num_list.length<0 && 1000<num_list.length){
            bool2 = false;
        }

        //num_list[] 배열의 마지막 인덱스 값부터 거꾸로 조회하여 result에 대입
        result = IntStream.range(0, num_list.length)
                .map(i -> num_list[num_list.length - 1 - i])   //num_list[] 배열의 마지막 원소부터 조회
                .toArray();

        return result;                    //최종 결과 반환
    }
}
