package Part_12_DP;

import java.util.Scanner;

public class 제곱수의_합 {

    static int getMin(int a, int b){   //a와 b중 최솟값을 구하는 함수
        return a > b ? b : a;
    }


    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();   //제곱수의 합으로 표현할 숫자

        final int MAX = 100005;
        int dp[] = new int[MAX];    //제곱수의 개수의 최솟값을 저장할 배열


        //dp[i] = 숫자 i를 제곱수로 나타내고자 할때 필요한 제곱수의 개수의 최솟값
        //dp[i] = Min(dp[j] + 1),  j=1-k^2,  j>=0

        for(int i=1; i<=n; i++){
            //T[i]를 구함

            dp[i] = Integer.MAX_VALUE;   //매우 큰 수로 초기화..  987987987같은 수로도 가능

            for(int j=1;; j++){  //j의 제곱이 맨 끝에 있을때
                if(i-(j*j) < 0) break;          //j의 제곱이 i보다 커지면 break;
                else if(i==j*j) dp[i] = 1;      //i가 j의 제곱과 같으면,    최소 제곱 개수는 1이다.
                else {
                    dp[i] = getMin(dp[i], dp[i-j*j]+1);   //i를 제곱수로 나타내고자 할때 필요한 제곱수의 개수의 최솟값
                }

            }
        }


        System.out.println(dp[n]);  // 숫자 n을 제곱수로 나타내고자 할때 필요한 제곱수의 개수의 최솟값

    }

}
