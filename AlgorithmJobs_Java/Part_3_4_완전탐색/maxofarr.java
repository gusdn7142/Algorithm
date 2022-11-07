package Part_3_완전탐색;

import java.util.Scanner;

public class maxofarr {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[9][9];

        //2차원 배열에 81개의 (1부터 100사이의) 값 입력
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        //변수 초기화
        int max = 0;
        int row = 0;
        int column = 0;

        //최댓값과 행번호 열번호 구하기
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(max < arr[i][j]) {
                    max = arr[i][j];
                    row = i+1;
                    column = j+1;
                }
            }
        }

        //최댓값과 행, 열 출력
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
