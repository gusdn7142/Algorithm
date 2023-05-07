package Lv0;

import java.util.Arrays;

public class 중앙값_구하기_v1 {
    public int solution(int[] array) {
        int result = 0;
        Arrays.sort(array);             //오름차순 정렬
        result = array[array.length/2]; //중앙값 조회

        return result;
    }
}
