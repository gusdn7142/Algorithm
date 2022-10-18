package Part_3_완전탐색;

import java.util.Scanner;

public class seat {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int col = scan.nextInt();  //공연장의 가로(열)
        int row = scan.nextInt();  //공연장의 세로(행)
        int k = scan.nextInt();    //대기번호

        //변수 초기화
        int arr[][] = new int[row+2][col+2];    //공연장의 크기... (1,1)부터 시작
        int cnt = 1;                            //좌석번호
        int startRow = 1;                       //시작 행은 1
        int startColumn = 1;                    //시작 열은 1


        //(1,1)부터 반시계 방향으로 공연장에 좌석 순번 입력
        while(cnt<=row*col){

            arr[startRow][startColumn] = cnt;
            cnt++;


            //아래로 이동하면서 숫자를 채움
            while (startRow+1 <= row && arr[startRow+1][startColumn] == 0) {
                ++startRow;
                arr[startRow][startColumn] = cnt;
                cnt++;
            }

            //오른쪽으로 이동하면서 숫자를 채움
            while (startColumn+1 <= col && arr[startRow][startColumn+1] == 0) {
                ++startColumn;
                arr[startRow][startColumn] = cnt;
                cnt++;
            }


            //위로 이동하면서 숫자를 채움
            while (startRow-1 >= 1 && arr[startRow-1][startColumn] == 0) {
                --startRow;
                arr[startRow][startColumn] = cnt;
                cnt++;
            }

            //왼쪽으로 이동하면서 숫자를 채움
            while (startColumn-1 >= 1 && arr[startRow][startColumn-1] == 0) {
                --startColumn;
                arr[startRow][startColumn] = cnt;
                cnt++;
            }

            if (arr[startRow+1][startColumn] == 0) {  //숫자가 겹치는 것을 방지
                ++startRow;
            }

        }

        //대기번호 k에 해당되는 좌석의 행과 열 좌표를 출력
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(arr[i][j] == k){
                    System.out.print(j + " " + i);
                    System.exit(0);
                    //System.out.print(arr[i][j] + " ");
                }
            }
            //System.out.println();
        }

        System.out.print("0");   //대기번호 k에 해당하는 좌석이 없는것이므로 "0" 출력

    }
}
