package Lv2;

public class 주식가격_v1 {
    public int[] solution(int[] prices) {
        int[] time = new int[prices.length];   //초별 주식가격이 떨어지지 않은 기간 (초)

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                time[i]++;

                if(prices[i] > prices[j])
                    break;
            }
        }

        return time;
    }
}
