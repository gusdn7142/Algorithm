package Lv0;

public class 두수의_곱 {
    public int solution(int num1, int num2) {
        int result = 0;

        boolean rangeCheck = (0<num1 && num1<=100 && 0<num2 && num2<=100);

        if(rangeCheck){  //num1과 num2의 입력값의 범위가 100 이하이면
            result = num1 * num2;
        }

        return result;
    }
}
