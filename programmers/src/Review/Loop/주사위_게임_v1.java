package Review.Loop;

import java.util.Scanner;

public class 주사위_게임_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //주사위 게임 참여자 n명 입력
        int n = scan.nextInt();

        int r = 0; //상금
        int result = 0; //상금의 최댓값

        for(int i=0; i<n; i++){

            //주사위 3개 입력
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            //규칙에 따른 상금 계산
            if(a==b && a==c){        //주사위 3개가 모두 같은 값일 경우
                r = 10000+a*1000;
            }
            else if(a==b && a!=c) {   //주사위 2개만 값이 같은 경우
                r = 1000+a*100;
            }
            else if(a==c && a!=b) {   //주사위 2개만 값이 같은 경우
                r = 1000+a*100;
            }
            else if(b==c && b!=a) {   //주사위 2개만 값이 같은 경우
                r = 1000+b*100;
            }
            else{
                if(a>b && b>c) {     //a 주사위의 값이 제일 큰 경우
                    r = a*100;
                }
                else if(b>a && b>c){  //b 주사위의 값이 제일 큰 경우
                    r = b*100;
                }
                else
                    r = c*100;
            }


            //상금의 최댓값 구하기
            if(result < r){
                result = r;
            }
        }

        //상금의 최댓값 출력
        System.out.println(result);
    }
}
