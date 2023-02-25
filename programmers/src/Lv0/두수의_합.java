package Lv0;

public class 두수의_합 {
    public int solution(int num1, int num2) {
        int result = 0;

        if(-50000<=num1 && num1<=50000 && -50000<=num2 && num2<=50000){
            result = num1 + num2;
        }

        return result;
    }
}
