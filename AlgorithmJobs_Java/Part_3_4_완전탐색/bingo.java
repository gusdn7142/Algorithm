package Part_3_완전탐색;

import java.util.Scanner;

public class bingo {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //변수 초기화
        int arr[][] = new int[5][5];   //빙고판으로 사용할 배열 초기화


        //arr[][] 배열에 1~25까지의 숫자 25개 입력
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr[i][j]=scan.nextInt();
            }
        }


        int order=0;                    //빙고판을 지울 숫자를 입력받는 순서
        for(int k=0; k<25; k++){         //사회자가 부른 수 만큼 반복

            int cnt=0;                   //빙고 횟수
            int num = scan.nextInt();   //빙고를 지울 25개의 숫자 입력
            order++;

            //arr[][]배열에 입력받은 숫자가 있는지 확인 후 값을 0으로 변경
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    if(arr[i][j]==num) arr[i][j]=0;
                }
            }


            //arr[][] 배열의 행에 빙고가 있는지 검사
            for(int i=0; i<5; i++){
                int xCnt=0;
                for(int j=0; j<5; j++){
                    if(arr[i][j]==0) xCnt++;
                }
                if(xCnt==5) {
                    cnt++;
                }
            }


            //arr[][] 배열의 열에 빙고가 있는지 검사
            for(int i=0; i<5; i++){
                int xCnt=0;
                for(int j=0; j<5; j++){
                    if(arr[j][i]==0) xCnt++;
                }
                if(xCnt==5) {
                    cnt++;
                }
            }

            //arr[][] 대각선에 열에 빙고가 있는지 검사
            //좌상우하 대각선
            if(arr[0][0]==0 && arr[1][1]==0 && arr[2][2]==0 && arr[3][3]==0 && arr[4][4]==0){
                cnt++;
            }
            //우상좌하 대각선
            if(arr[4][0]==0 && arr[3][1]==0 && arr[2][2]==0 && arr[1][3]==0 && arr[0][4]==0){
                cnt++;
            }



            if(cnt>=3) {   //빙고가 3줄 이상이면
                System.out.println(order);   //입력받은 순서 출력
                System.exit(0);
            }

        }




    }
}
