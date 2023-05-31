package Lv1;

public class 부족한_금액_계산하기_v2 {
    public long solution(int price, int money, int count) {
        long result = 0;
        long totalPrice = 0;

        //부족한 금액 계산 (등차수열의 합 공식 사용)
        result =  (long)price*count*(count+1)/2 - money;
        if(result < 0)
            result = 0;

        return result;
    }
}
