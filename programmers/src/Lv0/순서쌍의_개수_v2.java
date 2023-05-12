package Lv0;

import java.util.stream.IntStream;

public class 순서쌍의_개수_v2 {
    public int solution(int n) {
        int result = (int) IntStream.rangeClosed(1, n)
                .filter(i -> n%i==0)
                .count();

        return result;
    }
}
