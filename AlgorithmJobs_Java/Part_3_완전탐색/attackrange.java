package Part_3_완전탐색;

import java.util.Scanner;

public class attackrange {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();  //맵 크기
        int y = scan.nextInt(); //배열의 행
        int x = scan.nextInt();   //배열의 열
        int r = scan.nextInt();    //사거리

        //변수 초기화
        int arr[][] = new int[n+2][n+2];  //출력시 사용될 2차원 배열 (1행부터 시작)


        //n*n 맵의 x,y좌표들과 입력받은 유닛의 x,y좌표의 차를 구해 x와 y 좌표의 차가 사거리(r)보다 작으면 좌표에 사거리(r) 값을 저장
        for(int i=1; i<=n; i++){      //1행부터 시작
            for(int j=1; j<=n; j++){

                int first = i-y;   //x좌표와 유닛의 행번호의 차이
                int second = j-x;  //y좌표와 유닛의 열번호의 차이

                if(first<0) first *= -1;   //first가 음수이면 양수로 변경
                if(second<0) second *= -1;   //second가 음수이면 양수로 변경


                int dist = first+second;      //x좌표간 y좌표간 차이
                if(dist==0) arr[i][j] = -1;   //임시로 -1로
                else if(dist <= r) arr[i][j] = dist;  //배열에 사거리 저장

            }
        }


        //2차원 배열 출력
        for(int i=1; i<=n; i++){      //1행부터 시작
            for(int j=1; j<=n; j++){

                if (arr[i][j]==-1) System.out.print("x ");
                else System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }


}
