package Part_3_완전탐색;

import java.util.Scanner;

public class Tetris {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int c = scan.nextInt();  //테트리스 맵의 열의 수
        int r = scan.nextInt();  //테트리스 맵의 행의 수

        //변수 초기화
        int arr[][] = new int[r+1][c+1];  //테트리스 맵
        int idx = 0;                    //출력할 막대기의 좌표 (열 번호)
        int ans = 0;                   //출력할 최대 수평선 점수

        //테트리스 맵 만들기
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                arr[i][j] = scan.nextInt();
            }
        }


        //테트리스의 한 열씩 막대기를 넣어본 후 몇 줄이 사라지는지 수평선 점수 계산 후 막대기를 제거
        for(int j=1; j<=c; j++){

            int position = 0;         //막대기를 놓을 위치

            //테트리스의 한 열씩 막대기를 넣어본다.
            for(int i=1; i<=r; i++){

                if(arr[i][j]==1){           //열에서 1을 만나면
                    position = i-1;  //막대기를 놓을 위치
                    break;
                }
                if(i==r && arr[i][j]==0) {   //열의 끝이 0이면
                    position = i;
                    break;
                }


            }

            if(position < 4) continue;     //막대기를 놓을 수 없다면
            for(int i=3; i>-1; i--) {  //막대기를 놓을 수 있다면 막대기를 놓는다
                arr[position-i][j]=1;
            }


            //몇 줄이 사라지는지 점수 계산
            int score=0;   //현재 총 수평선 점수
            for(int i=1; i<=r; i++){
                int cnt=0;                    //한 열씩 1로 표시되어 있는지 확인하는 변수
                for(int k=1; k<=c; k++){
                    if(arr[i][k]==1) cnt++;
                }
                if(cnt==c) score++;
            }

            if(ans < score){    //현재 점수가 이전 점수보다 크다면
                ans = score;   //출력할 최대 수평선 점수
                idx = j;         //출력할 막대기의 열 번호
            }

            //테트리스에 넣었던 막대기 제거
            for(int i=3; i>-1; i--){
                arr[position-i][j] = 0;
            }


        }

        System.out.println(idx + " " + ans);   //막대기의 좌표 (열 번호)와 최대 수평선 점수 출력

    }

}
