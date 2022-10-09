package Part_3_완전탐색;

import java.util.Scanner;

public class offset {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //2차원 배열 선언
        int arr[][] = new int[7][7];

        //2차원 배열에 값 입력
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        //초기값 셋팅
        for(int i=0; i<=6; i++){
            arr[0][i] = 10;  //상 : 10으로 초기화
            arr[6][i] = 10;  //하 : 10으로 초기화
            arr[i][0] = 10;  //좌 : 10으로 초기화
            arr[i][6] = 10;  //우 : 10으로 초기화
        }


        //상하좌우를 비교하여 조건에 따라 값을 '*'로 변경
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(arr[i][j] < arr[i-1][j] &&  //상하좌우 비교
                        arr[i][j] < arr[i+1][j] &&
                        arr[i][j] < arr[i][j-1] &&
                        arr[i][j] < arr[i][j+1]) {
                    System.out.print("* ");
                }
                else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
