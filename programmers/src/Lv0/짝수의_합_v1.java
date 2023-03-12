package Lv0;

public class 짝수의_합_v1 {
    public int solution(int n) {
        int result = 0;

        if(n<0 || 1000<n){
            return -1;
        }

        for(int i=2; i<=n; i++){
            if(i%2==0){       //i가 짝수이면
                result += i;  //짝수의 합 저장
            }
        }

        return result;
    }
}
