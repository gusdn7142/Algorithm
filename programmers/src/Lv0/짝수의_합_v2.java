package Lv0;

import java.util.stream.IntStream;

public class 짝수의_합_v2 {
    public int solution(int n) {
        return IntStream.rangeClosed(2, n)         //스트림 생성 : 2부터 n까지의 정수 범위 포함
                .filter(i -> i % 2 == 0)   //중간연산 : i가 2로 나누어 떨어지는 경우에만 요소를 다음 단계로 보냅니다.
                .sum();                    //최종연산 : 요소들의 합을 계산하여 int형으로 리턴
    }
}
