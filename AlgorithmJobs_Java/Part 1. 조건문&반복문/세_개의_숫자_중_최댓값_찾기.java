package Part_1_조건문and반복문;

import java.util.Scanner;

public class 세_개의_숫자_중_최댓값_찾기 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //3개의 정수 입력
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        //3개의 정수 비교 후 최댓값 출력
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else
            System.out.println(c);
    }
}
