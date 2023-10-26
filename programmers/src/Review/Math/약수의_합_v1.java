package Review.Math;

public class 약수의_합_v1 {
    public int solution(int n) {
        int result = 0;

        //n의 약수의 합 계산
        for(int i=1; i<=n/2; i++){
            if(n % i ==0) {
                result += i;
            }
        }

        return result+n;
    }
}
