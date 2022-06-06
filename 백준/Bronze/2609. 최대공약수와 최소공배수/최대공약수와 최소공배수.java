import java.util.Scanner;

import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //두 정수 입력
        int a = scan.nextInt();
        int b = scan.nextInt();

        //최대공약수 선언
        int g = 1;

        //최대 공약수 구하기
        for (int i=2; i<=min(a,b); i++) {     //2부터 min(a,b)까지 반복
            if (a % i == 0 && b % i == 0) {   //a와 b가 동시에 i로 나누어 떨어지면
                g = i;                        //g에 i 입력
            }
        }

        //최대공약수 출력
        System.out.println(g);

        //최소공배수 출력
        int l = a*b/g;   //최소공배수 선언 (두 수의 곱을 최대공약수로 나눈것과 같다)
        System.out.println(l);


    }


}
