package Review.Loop;

import java.util.Scanner;

public class 숫자_파라미드_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();        //피라미드의 최대 행
        int s = scan.nextInt();        //시작 숫자

        //변수 초기화
        int number = 1;               //출력 숫자 개수
        int space = n-1;              //공백 출력을 위한 변수
        int currentFirst=s;           //현재 값
        int arr[] = new int[n*n];     //출력 값을 저장할 배열


        for(int i=1; i<=n; i++){   //최대 행 만큼 반복하면서 배열에 한 행씩 저장 후 출력

            //공백 출력
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }
            space--;

            //배열에 한 행 저장
            if(i==1) arr[0]=currentFirst;
            else{
                for(int j=0; j<number; j++){   //number만큼 한 행 저장
                    currentFirst++;
                    if(currentFirst >= 10) currentFirst=1;
                    arr[j] = currentFirst;
                }
            }

            //배열에 한 행 출력
            if(i%2==0 || i==1){                //짝수줄 or 첫행
                for(int j=0; j<number; j++){   //number만큼 한 행 출력
                    System.out.print(arr[j]);
                }
            }
            else  {                               //홀수줄
                for(int j=number-1; j>-1; j--){   //number만큼 한 행 출력
                    System.out.print(arr[j]);
                }
            }

            number += 2;
            System.out.println();
        }
    }
}
