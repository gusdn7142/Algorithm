package Lv0;

import java.util.Arrays;

public class 머쓱이보다_키_큰_사람_v2 {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                .filter(i -> i > height)
                .count();
    }
}
