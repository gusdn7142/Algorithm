package Review.Loop;

import java.util.ArrayList;

public class 같은_숫자는_싫어_v1 {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = 10;

        for(int num : arr) {
            if(temp != num) {             //반복되는 수의 첫 숫자만 list에 삽입
                list.add(num);
            }
            temp = num;
        }

        int[] result = new int[list.size()];

        for(int i=0; i<result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
