package Review.Math;

public class 부족한_금액_계산하기_v1 {
    public long solution(int price, int money, int count) {
        long result = 0;
        long totalPrice = 0;

        //놀이기구 이용료 계산
        for(int i=1; i<=count; i++){
            totalPrice += price * i;
        }

        //부족한 금액 계산
        result = totalPrice - money;
        if(result < 0)
            result = 0;

        return result;
    }
}
