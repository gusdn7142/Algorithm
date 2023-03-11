package Lv0;

public class 양꼬치_v1 {
    public int solution(int n, int k) {

        int result = 0;            //총 가격 (양꼬치+음료수)
        int chickenPrice = 12000;  //양꼬치 기본 가격
        int drinkPrice = 2000;     //음료수 기본 가격
        int servicePrice = 0;      //서비스 음료수 가격

        boolean bool1 = (0<n && n<1000) ? true : false;       //양꼬치 개수의 제한범위 체크
        boolean bool2 = ((n/10)<=k && k<1000) ? true : false;  //음료수 개수의 제한범위 체크

        //양꼬치와 음료수 값 계산
        if(bool1 && bool2){
            result += n*chickenPrice;              //양꼬치 값 계산
            servicePrice = (n/10)*drinkPrice;     //서비스 음료수 값 계산
            result += k*drinkPrice-servicePrice;   //음료수 값 계산 추가
        }

        return result;   //총 가격 반환
    }
}
