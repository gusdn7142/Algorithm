package Part_12_DP;

import java.util.Scanner;

public class 버튼_누르기 {
    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();    //주어진 시간

        final int MAX = 100005;
        int arr[][] = new int[MAX][3];         //n 시간에 대한 빨, 초, 파 버튼의 점수 저장
        int dp[][] = new int[MAX][3];           //n 시간에 대한 빨, 초, 파 버튼의 누적 최댓값 저장

        for(int i=0; i<n; i++) {   //n 시간에 대한 빨, 초, 파 버튼의 점수
            int red = scan.nextInt();     //빨간색 버튼 값 입력
            int green = scan.nextInt();   //초록색 버튼 값 입력
            int blue = scan.nextInt();    //파란색 버튼 값 입력

            arr[i][0] = red;    //시간당 빨간 버튼 값 저장
            arr[i][1] = green;  //시간당 초록 버튼 값 저장
            arr[i][2] = blue;   //시간당 파랑 버튼 값 저장
        }

        //변수 초기화
        dp[0][0] = arr[0][0];   //첫번쨰 시간에 0번째 빨간 버튼의 값 저장
        dp[0][1] = arr[0][1];   //첫번쨰 시간에 1번째 초록 버튼의 값 저장
        dp[0][2] = arr[0][2];   //첫번째 시간에 2번째 파란 버튼의 값 저장


        //n-1 시간까지 눌린 빨(j), 초(j), 파(j) 버튼의 누적 최댓값 구하기
        for(int i=1; i<n; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){

                    if(j==k) continue;  //j랑 k랑 같으면 다음 반복 진행

                    dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + arr[i][j]);      //dp[i][j]번째까지의 점수의 누적 최댓값

                }
            }
        }


        System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));   //마지막 시간(n-1)에 저장된 점수가 최댓값이므로 빨간(0), 초록(1), 파랑(2) 중에 누적 최댓값이 가장 큰 값을 출력
    }

}
