package Lv0;

import java.util.Arrays;

public class 최댓값_만들기2_v2 {
    public int solution(int[] numbers) {

        Arrays.sort(numbers);  //오름차순 정렬
        int len = numbers.length;
        int max = Math.max(numbers[0]*numbers[1], numbers[len-1]*numbers[len-2]);

        return max;
    }
}
