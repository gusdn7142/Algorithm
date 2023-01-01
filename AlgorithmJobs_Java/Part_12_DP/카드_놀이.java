package Part_12_DP;

import java.util.Scanner;

public class 카드_놀이 {
    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();    //카드 수
        int dp[] = new int[3];      //카드 값의 최갯값을 구하는 3가지 경우의 수 저장 배열


        //3가지 경우의 수를 고려하여 고른 카드 값의 최댓값을 구하는  DP로직
        for(int i=0; i<n; i++){
            int value = scan.nextInt();  //n개의 카드 점수 입력

            if(i==0){               //첫번째 카드 값 입력시
                dp[0] = 0;         //입력값을 뽑지 않을 경우 얻을 수 있는 최댓값
                dp[1] = value;     //입력값을 뽑을 경우 얻을 수 있는 최댓값
                dp[2] = 0;         //입력값과 그 전 값을 뽑을 경우 얻을 수 있는 최댓값
            }
            else{               //2번쨰 부터 ~ n-1번째 카드 점수 입력시
                int max = Math.max(dp[0], Math.max(dp[1], dp[2]));  //기존의 dp배열의 값중 최댓값
                dp[2] = dp[1] + value;    //입력값과 그 전 값을 뽑을 경우 얻을 수 있는 최댓값
                dp[1] = dp[0] + value;    //입력값을 뽑을 경우 얻을 수 있는 최댓값
                dp[0] = max;             //입력값을 뽑지 않을 경우 얻을 수 있는 최댓값

            }
        }

        System.out.println(Math.max(dp[0], Math.max(dp[1], dp[2])));   //3가지 경우 중 최댓값 출력


    }
}
