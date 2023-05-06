package Lv0;

import java.util.Arrays;

public class 짝수_홀수_개수_v2 {
    public int[] solution(int[] num_list) {
        int[] result = new int[2];

        int evenCount = (int) Arrays.stream(num_list)   //짝수의 개수 계산
                .filter(num -> num%2==0)
                .count();

        int oddCount = num_list.length - evenCount;

        result[0] = evenCount;
        result[1] = oddCount;

        return result;
    }
}
