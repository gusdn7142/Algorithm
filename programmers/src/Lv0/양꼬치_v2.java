package Lv0;

public class 양꼬치_v2 {
    public int solution(int n, int k) {   //양꼬치 수량,  음료수 수량

        int result = 0;            //총 가격 (양꼬치+음료수)
        boolean bool1 = (0<n && n<1000) ? true : false;       //양꼬치 개수의 제한범위 체크
        boolean bool2 = ((n/10)<=k && k<1000) ? true : false;  //음료수 개수의 제한범위 체크

        //양꼬치와 음료수 값 계산
        if(bool1 && bool2){
            int foodTotalPrice = totalPrice(Menu.LAMB, n);  //양꼬치 총 가격 계산
            int drinkTotalPrice = totalPrice(Menu.DRINK, k);  //음료수 총 가격 계산
            int discountPrice = discountPrice(Menu.DRINK, n);//서비스 (할인받을) 음료수 가격 계산
            result = foodTotalPrice + drinkTotalPrice - discountPrice;
        }

        return result;   //총 가격 반환
    }

    public int totalPrice(Menu menu, int quantity){
        return menu.getPrice()*quantity;
    }

    public int discountPrice(Menu drink, int lambQuantity){
        int discountQuantity = lambQuantity/10;
        return drink.getPrice()*discountQuantity;
    }
}
enum Menu{

    LAMB("양꼬치",12000),
    DRINK("음료수",2000);

    private final String name;
    private final int price;

    Menu(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }
}