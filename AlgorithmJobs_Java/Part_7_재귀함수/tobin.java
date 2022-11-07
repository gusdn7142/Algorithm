package Part_5_재귀함수;

import java.util.Scanner;

public class tobin {
    //전역변수 초기화
    static int n;  //이진패턴 자릿수 n 입력
    static int k;  //이진패턴에서 1의 개수
    static int result[] = new int[35];   //값을 저장할 배열


    static void getResult(int index, int cnt){
        if(cnt>k) return;   //시간초과 에러 해결을 위해 필요

        if(index == n){     //기저조건...  이진패턴의 자릿수가 다 채워지면
            if(cnt==k){    //배열의 수들에서 1이 k개이면
                for(int i=0; i<n; i++){
                    System.out.print(result[i]);
                }
                System.out.println();
            }
        }
        else {
            for(int i=1; i>=0; i--){  //0아니면 1을 넣는다. (내림차순)
                result[index] = i;
                if(i==1) getResult(index+1, cnt+1);       //cnt는 호출되고 돌아오면 줄어든 상태이다!
                else getResult(index+1, cnt);
            }
            // result[index] = 1;
            // getResult(index+1, cnt+1);
            // result[index] = 0;
            // getResult(index+1, cnt);
        }
    }



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        n = scan.nextInt();  //이진패턴 자릿수 n 입력
        k = scan.nextInt();  //이진패턴에서 1의 개수
        getResult(0,0);     //재귀함수 호출 (index, cnt)
    }
}
