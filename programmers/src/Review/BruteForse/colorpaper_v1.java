package Review.BruteForse;

import java.util.Scanner;

public class colorpaper_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();            //색종이의 개수

        //변수 초기화
        int arr[][] = new int[101][101];   //맵 크기

        //맵에 n장의 색종이 만들기
        for(int i=1; i<=n; i++){      //n번 반복

            int y = scan.nextInt();    //색종이의 y좌표(열)
            int x = scan.nextInt();    //색종이의 x좌표(행)
            int h = scan.nextInt();    //색종이의 높이
            int w = scan.nextInt();    //색종이의 너비


            //색종이 만들기
            for(int j=y; j<y+h; j++){      //행
                if(j>100) continue;        //행이 배열 밖으로 벗어나면
                for(int k=x; k<x+w; k++){   //열
                    if(k>100)  continue;   //열이 배열 밖으로 벗어나면
                    else arr[j][k] = i;    //n개의 색종이마다 다른값 부여
                }
            }

        }

        //n개의 색종이에 대한 면적의 합 각각 출력
        for(int i=1; i<=n; i++){        //n번 반복
            int sum = 0;                //색종이 면적의 합
            for(int j=0; j<101; j++){
                for(int k=0; k<101; k++){
                    if(arr[j][k]==i) sum++;
                }
            }
            System.out.println(sum);
        }

        // for(int i=1; i<=n; i++){      //n번 반복
        //     for(int j=0; j<101; j++){
        //         for(int k=0; k<101; k++){
        //             System.out.print(arr[j][k]);
        //         }
        //         System.out.println();
        //     }
        // }

    }
}
