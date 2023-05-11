package Lv0;

public class 옷가게_할인_받기 {
    public int solution(int price) {
        int result = 0;
        double discountPrice = 0;

        //지불할 금액 계산
        if(0<=price && price<100000){
            result = price;
        }
        else if(100000 <= price && price < 300000){
            result = (int)(price * 0.95);
        }
        else if(300000 <= price && price < 500000){
            result = (int)(price * 0.90);
        }
        else if(500000 <= price){
            result = (int)(price * 0.80);
        }

        return result;
    }
}
