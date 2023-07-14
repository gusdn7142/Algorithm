package Review.Array;

import java.util.Arrays;

public class 예산_v1 {
    public int solution(int[] d, int budget) {
        int count = 0;   //최대 물품 지원 가능 부서 수
        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            budget -= d[i];
            if(budget < 0) break;
            count++;
        }

        return count;
    }
}
