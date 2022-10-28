package Part_5_재귀함수;

import java.util.Scanner;

public class division {
    static int[] result = new int[30];    //값을 저장할 배열
    static int n;                         //임의의 자연수
    static int cnt;                      //출력횟수 카운트

    // 0 1 2 3 4
    // 3 2 x x x
    static void getResult(int sum, int index){
        //현재까지 구한 합이 mySum
        //그리고 지금, index번째 숫자를 결정할 차례.  즉, result[index]

        if(sum == n){                       //기저 조건... 배열안의 숫자의 합이 n이면 배열 값을 형식에 맞게 전부 출력
            System.out.print(result[0]);   //맨 처음 숫자는 그냥 출력
            for(int i=1; i<index; i++){
                System.out.print("+" + result[i]);   //두번째부터 + 붙여서 출력
            }
            System.out.println();
            cnt++;         //카운트값 ++
        }
        else {
            //int num;
            //if(index==0) num = n-1;
            //else num = n-sum;

            for(int i=n-sum; i>=1; i--){
                if(index==0 && i==n) i = n-1;
                result[index] = i;    //i번째수를 배열에 넣음…

                if(index > 0 && result[index-1] < result[index]) continue;
                getResult(sum+i, index+1);
            }


        }




    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        n = scan.nextInt();   //임의의 자연수
        getResult(0,0);        //재귀함수 호출
        System.out.println(cnt);    //카운트값 출력
    }


}
