package Lv1;

public class 삼진법_뒤집기_v1 {
    public int solution(int n) {
        int result = 0;             //최종 결과 값
        String str = "";            //10진법 -> 3진법 수 저장

        //10진법 수를 거꾸로 된 3진법으로 변환
        while(true){
            str += n % 3;
            n /= 3;
            if(n==0) break;
        }

        //3진법 수를 10진법으로 변환
        Long num = Long.parseLong(str);
        for(int i=0; i<str.length(); i++){
            int temp = 1;
            for(int j=0; j<i; j++){
                temp *= 3;
            }

            result += (num % 10) * temp;   //나머지 (일의 자리부터)
            num = num / 10;            //몫 (다음 나눌 수)
        }

        return result;
    }
}
