package Review.Math;

import java.util.stream.IntStream;

public class 약수의_합_v2 {
    public int solution(int n) {
        int result = 0;

        result = IntStream.rangeClosed(1, n)
                .filter(i -> n % i ==0)
                .sum();

        return result;
    }
}
