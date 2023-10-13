package Review.Loop;

import java.util.Scanner;

public class array3_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //n 입력
        int n = scan.nextInt();

        //변수 초기화
        int x = 0;
        int y = 0;
        int arr[][] = new int[100][100];
        int num = 1;  //1부터 시작

        //2차원 배열 arr[]의 열(x)이 n과 같아질때까지 반복하면서 배열 arr[]에 값 입력
        while(x != n){
            arr[y][x] = num++;

            if(x==0){   //x좌표가 0이면
                x = y+1;
                y = 0;
            }

            else {  //x좌표가 0이 아니면
                y++;
                x--;
            }
        }

        //arr[] 배열 값 모두 출력
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==0) continue;
                else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
