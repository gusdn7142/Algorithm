package Lv2;

public class 멀리_뛰기_v2 {
    public long solution(int n) {

        long[] dp = new long[2000+1];  //n칸의 끝에 도달하는 방법의 수

        dp[1] = 1;
        dp[2] = 2;

        //dp[n]까지의 값 계산
        for(int i=3; i<=2000; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }

        return dp[n];
    }
}
