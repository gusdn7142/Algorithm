package Part_5_재귀함수;

import java.util.Scanner;

public class binary {
    //static int result[] = new int[11];   //n의 최대크기는 1000이고 1000은 이진수로 1111101000이기 때문에 한 자리 늘려 11자리로 선언
    //static int cnt = 0;

    //10진수를 이진수로 변환 후 출력하는 함수
    static void getBinary(int x){

        if(x == 1) {               //기저조건..  x가 1이면
            System.out.print(x);
            return;
            // result[cnt] = 1;      //이진수의 맨 마지막 수를 1로 셋팅
            // for(int i=cnt; i>-1; i--){     //이진수 출력
            //     System.out.print(result[i]);
            // }
        }
        else {                    //x가 1이 아니면
            //result[cnt] = x % 2;    //배열에 이진수를 넣음.
            //cnt++;
            getBinary(x/2);         //재귀함수 반복 (몫이 인자)
            System.out.print(x % 2);
        }
    }





    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();    //10진수 n입력

        //재귀함수 호출
        getBinary(n);


    }
}
