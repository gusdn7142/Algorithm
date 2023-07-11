package Review.Array;

import java.util.stream.LongStream;

public class n제곱_배열_자르기_v2 {
    public int[] solution(int n, long left, long right) {

        int[] result = LongStream.rangeClosed(left, right)                     //left부터 right까지 반복하면서
                .mapToInt(value -> (int) (Math.max(value / n, value % n) + 1))    //가상 2차원 배열의 row와 column을 구해 둘 중 큰 값을 배열에 저장
                .toArray();

        return result;
    }
}
