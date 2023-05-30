package Lv1;

public class 삼진법_뒤집기_v2 {
    public int solution(int n) {
        int result = 0;             //최종 결과 값
        String str = "";            //10진법 -> 3진법 수 저장

        //10진법 수를 거꾸로 된 3진법 수로 변환
        while(true){
            str = n % 3 + str;
            n /= 3;
            if(n==0) break;
        }
        str = new StringBuilder(str).reverse().toString();


        //3진법 수를 10진법으로 변환
        result =  Integer.parseInt(str,3);

        return result;
    }
}
