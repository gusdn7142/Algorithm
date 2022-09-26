package Part_1_조건문and반복문;

import java.util.Scanner;

public class 제곱근_구하기 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //정수 n입력
        int n = scan.nextInt();

        //제곱하여 n보다 크거나 같은 숫자들 중 최솟값 출력
        for(int i=1; ; i++){
            if(n<=i*i){
                System.out.println(i);
                break;
            }
        }
    }
}
