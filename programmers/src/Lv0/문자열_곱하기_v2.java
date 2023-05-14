package Lv0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 문자열_곱하기_v2 {
    public String solution(String my_string, int k) {
        String result = IntStream.rangeClosed(1,k)
                .mapToObj(i -> my_string)           //참조형으로 변환하여 반환
                .collect(Collectors.joining());     //스트림의 요소들을 하나의 문자열로 연결

        return result;
    }
}
