package Lv0;

public class 피자_나눠_먹기1 {
    public int solution(int n) {
        int result = -1;

        if(1<=n && n<=100){   //n값의 범위 체크
            if(n % 7 == 0) result = n / 7;  //필요한 피자 수 계산
            else result = (n / 7) + 1;
        }

        return result;
    }
}
