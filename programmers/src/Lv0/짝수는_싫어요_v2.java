package Lv0;

import java.util.stream.IntStream;

public class 짝수는_싫어요_v2 {
    public int[] solution(int n) {

        int[] result = IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 != 0)
                .toArray();

        return result;
    }
}
