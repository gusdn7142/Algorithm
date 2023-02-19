package Lv0;

public class 숫자_비교하기 {
    public int solution(int num1, int num2) {
        int result = 0;

        if(0<=num1 && num1 <=10000 && 0<=num2 && num2 <=10000){
            result = (num1==num2 ? 1 : -1);
        }

        return result;
    }
}
