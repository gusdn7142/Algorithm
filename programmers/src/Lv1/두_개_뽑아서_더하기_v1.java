package Lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두_개_뽑아서_더하기_v1 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        boolean visited[] = new boolean[200];

        //1. 서로 다른 인덱스의 2개의 수의 합을 중복 없이 set에 저장
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }

        //2. set을 배열로 변환
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        //3. 배열 오름차순 정렬
        Arrays.sort(result);

        return result;
    }
}
