package Part_12_DP;

import java.util.Scanner;

public class 자원_채취 {
    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();    //지도의 세로 길이
        int m = scan.nextInt();    //지도의 가로 길이

        final int MAX = 1005;
        int arr[][] = new int[MAX][MAX];  //지도
        int dp[][] = new int[MAX][MAX];   //i행 j열에서 로봇이 채취할 수 있는 자원의 양의 최댓값을 저장하는 배열

        for(int i=0; i<n; i++){     //지도에 자원 입력
            for(int j=0; j<m; j++){
                arr[i][j] = scan.nextInt();
            }
        }


        //n-1행 m-1열에서 로봇이 채취할 수 있는 자원의 양의 최댓값을 구하는 DP로직
        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){
                int value = arr[i][j];               //i행 j열 지도의 자원값 조회

                if(i==0 && j==0) {                    //행(i)와 열(j)가 모두 0일떄
                    dp[i][j] = value;                   //vlaue를 그냥 저장
                } else if(i==0){                     //행(i)만 0일떄
                    dp[i][j] = dp[i][j-1]+value;     //위쪽 dp 배열+value를 저장
                } else if(j==0){                     //열(j)만 0일떄
                    dp[i][j] = dp[i-1][j]+value;    //왼쪽 dp 배열 최댓값 + vlaue를 저장
                } else{                             //행(i)과 열(j)가 모두 0이 아니면
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + value;       //왼쪽 dp배열의 최댓값과 위쪽 dp배열의 최댓값을 비교하여 큰 값 + value를 저장
                }
            }
        }

        System.out.println(dp[n-1][m-1]);    //n-1행 m-1열의 자원의 양의 최댓값을 출력한다.

    }
}
