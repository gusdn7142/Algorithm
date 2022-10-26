package Part_5_재귀함수;

import java.util.Scanner;

public class 팩토리얼 {
    static int getFactorial(int x){

        if(x==1){      //기저조건.. x가 1이면
            return 1;
        }

        return x * getFactorial(x-1);  //재귀함수 반복 (인자는 x-1)
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();                 //자연수 n입력
        System.out.println(getFactorial(n));    //팩토리얼 출력


    }
}
