package Lv1;

import java.util.stream.IntStream;

public class 내적_v2 {
    public int solution(int[] a, int[] b) {

        int result = IntStream.range(0, a.length)
                .map(i -> a[i] * b[i])
                .sum();

        return result;
    }
}
