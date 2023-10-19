package Review.BruteForse;

import java.util.Scanner;

public class rock_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int arr[][] = new int[8][8];   //체스판 배열
        int kingY = 0;                //킹의 y좌표
        int kingX = 0;                //킹의 x좌표
        int rookY[] = new int[2];     //룩의 y좌표
        int rookX[] = new int[2];     //룩의 x좌표
        int rookCnt = 0;              //룩의 개수
        boolean flag = false;         //룩이 킹을 잡았는지 판별

        //체스판 입력
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                arr[i][j] = scan.nextInt();

                if(arr[i][j]==1){  //king의 x,y 좌표 저장
                    kingY = i;
                    kingX = j;
                }
                else if(arr[i][j]==2){  //룩의 x,y 좌표 저장
                    rookY[rookCnt] = i;
                    rookX[rookCnt] = j;
                    rookCnt++;
                }
            }
        }

        //룩이 킹을 잡을 수 있는지 상하좌우를 검사
        for(int k=0; k<2; k++){

            int ry=rookY[k];
            int rx=rookX[k];

            //'상' 검사
            for(int i=ry-1; i>=0; i--){
                if(arr[i][rx]==1) flag=true;
                else if(arr[i][rx]==3) break;
            }
            //'하' 검사
            for(int i=ry+1; i<8; i++){
                if(arr[i][rx]==1) flag=true;
                else if(arr[i][rx]==3) break;
            }
            //'좌' 검사
            for(int i=rx-1; i>=0; i--){
                if(arr[ry][i]==1) flag=true;
                else if(arr[ry][i]==3) break;
            }
            //'우' 검사
            for(int i=rx+1; i<8; i++){
                if(arr[ry][i]==1) flag=true;
                else if(arr[ry][i]==3) break;
            }
        }

        //결과 출력
        if(flag==true) System.out.println("1");
        else System.out.println("0");
    }
}
