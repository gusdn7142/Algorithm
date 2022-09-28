package Part_2_다중_반목문and배열;

import java.util.Scanner;

public class 삼각형_출력_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //n층의 삼각형 출력
        for (int i = 1; i <= n; i++) {       //행
            for (int j = 1; j <= i; j++) { //열
                System.out.print("*");  //* 출력
            }
            System.out.println();       //줄바꿈
        }
    }
}
