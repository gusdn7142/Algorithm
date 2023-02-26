package Lv0;

public class 두수의_나눗셈 {
    public int solution(int num1, int num2) {
        int result = 0;

        if(0<=num1 && num1<=100 && 0<=num2 && num2<=100  ){
            result = (int)((num1 / (double)num2) * 1000);    //실수형으로 변환 후 나눈셈 * 1000
        }

        return result;
    }
}
