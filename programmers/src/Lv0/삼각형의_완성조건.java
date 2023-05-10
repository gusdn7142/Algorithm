package Lv0;

import java.util.Arrays;

public class 삼각형의_완성조건 {
    public int solution(int[] sides) {
        int result = 0;

        Arrays.sort(sides);                   //배열 오름차순 정렬
        if(sides[2] < sides[0] + sides[1]){   //삼각형을 만들 수 있는 조건이면
            result = 1;
        }
        else result = 2;

        return result;
    }
}
