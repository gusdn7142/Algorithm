package Review.BruteForse;

import java.util.Scanner;

public class 행렬_뒤집기_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //뒤집을 횟수 n번 입력
        int n = scan.nextInt();   //맵을 뒤집을 횟수

        //변수 초기화
        int arr[][] = new int[11][11];   //맵의 크기,  1행부터 시작하므로 11*11로 선언,  모든 요소는 0으로 초기화됨.


        //n번 만큼 맵을 뒤집어 0은 1로, 1은 0으로 값을 변경
        for(int i=1; i<=n; i++){

            for(int j=1; j<=10; j++){  //10행 10열만큼 뒤집기

                //배열의 i번 열의 모든 행 뒤집기
                if(arr[j][i]==1) arr[j][i]=0;
                else if(arr[j][i]==0) arr[j][i]=1;

                if(i==j){      //i==j일때 (i,j)의 값을 뒤집었기 때문에 (j,i) 값을 뒤집을 필요가 없음.
                    continue;
                }

                //배열의 i번 행의 모든 열 뒤집기
                if(arr[i][j]==1) arr[i][j]=0;
                else if(arr[i][j]==0) arr[i][j]=1;
            }
        }


        //맵의 상태 출력
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
