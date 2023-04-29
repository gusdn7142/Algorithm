package Lv0;

import java.util.Arrays;

public class 짝수는_싫어요_v1 {
    class Solution {
        public int[] solution(int n) {
            int[] temp = new int[n];

            int index = 0;
            for(int i=1; i<=n; i++){
                if(i % 2 != 0){
                    temp[index++] = i;
                }
            }

            int[] result = Arrays.copyOf(temp, index);

            return result;
        }
    }
}
