package Part_12_DP;

import java.util.Scanner;

public class 숫자_만들기 {


    public static void main(String[] args){


        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();    //만들어아 하는 수


        //변수 초기화
        final int MAX = 100005;
        int dp[] = new int[MAX]; //1~3을 이용하여 n을 만드는 경우의 수 d[n]을 저장할 배열

        dp[1] = 1;  //1~3을 이용하여 1을 만드는 경우의 수
        dp[2] = 2;  //1~3을 이용하여 2을 만드는 경우의 수
        dp[3] = 4;  //1~3을 이용하여 3을 만드는 경우의 수


        //1~3을 이용하여 n를 만드는 경우의 수를 구하는 DP 로직
        for(int i=4; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];   //1~3을 이용하여 i를 만드는 경우의 수
            dp[i] %= 1000007; //마지막 출력시에만 mod연산을 해줄 경우 int형의 Max값을 넘어 Overflow 가 발생할 수 있기 떄문에 d[i]를 구할때마다 적용
            //System.out.println("dp" + i + "는 " + dp[i]);
        }


        // for(int i=4; i<=n; i++){   //m+1부터
        //     for(int j=i-3; j<=i-1; j++){   //m개 돌린다
        //         dp[i] += dp[j];  //ex, table[m+1] = table[1] + table[2] + table[3].... + table[m]
        //     }
        //     dp[i] %= 1000007;
        //     //System.out.println("table " + i + "는 " + table[i]);
        // }

        System.out.println(dp[n]); //1~3을 이용하여 n을 만드는 경우의 수



    }
}
