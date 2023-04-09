package Lv0;

public class 피자_나눠_먹기3 {
    public int solution(int slice, int n) {
        int result = 0;

        if(1<=n && n<=100 && 2<=slice && slice<=10){
            if(n % slice==0){       //1인당 피자를 먹은 수가 동일하면
                result = n / slice; //먹은 피자 수 계산
            }
            else {
                result = n / slice + 1; //먹은 피자 수 계산
            }
        }
        return result;
    }
}
