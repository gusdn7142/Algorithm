package Part_12_DP;

import java.util.Scanner;

public class 구슬_게임 {
    public static void main(String[] args){

        //입력
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();    //전체 구슬의 개 수

        if(n%4==0){   //전체 구슬 수가 4로 나누어 떨어지면
            System.out.println("NO");  //철수가 진다
        }else{
            System.out.println("YES");  //철수가 이긴다.
        }
    }
}
