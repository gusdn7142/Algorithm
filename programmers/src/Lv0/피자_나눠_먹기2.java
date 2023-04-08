package Lv0;

public class 피자_나눠_먹기2 {
    public int solution(int n) {
        int result = 0;

        if(1<=n && n<=100){
            for(int i=1;  ;i++){
                if((n*i) % 6==0){       //1인당 피자를 먹은 수가 동일하면
                    result = (n*i) / 6; //먹은 피자 수 계산
                    break;
                }
            }
        }
        return result;
    }
}
