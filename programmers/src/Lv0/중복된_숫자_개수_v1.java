package Lv0;

import java.util.Arrays;

public class 중복된_숫자_개수_v1 {
    public int solution(int[] array, int n) {

        int count = (int) Arrays.stream(array)
                .filter(i -> i==n)
                .count();

        return count;
    }
}
