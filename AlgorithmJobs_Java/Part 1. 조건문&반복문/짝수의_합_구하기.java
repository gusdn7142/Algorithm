package Part_1_조건문and반복문;

import java.util.Scanner;

public class 짝수의_합_구하기 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;

        for(int i=1; i<=N; i++){    //1부터 N까지 반복
            if(i % 2 == 0){   //i가 2로 나누어 떨어지면 짝수
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
