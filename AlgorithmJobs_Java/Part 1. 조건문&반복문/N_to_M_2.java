package Part_1_조건문and반복문;

import java.util.Scanner;

public class N_to_M_2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //자연수 n과 m 입력
        int n = scan.nextInt();
        int m = scan.nextInt();

        //카운트 변수 초기화
        int cnt = 0;

        //n부터 m까지 반복하면서 i 출력
        for(int i=n; i<=m; i++){
            System.out.print(i + " ");
            cnt++;

            if(cnt==8){  //한 줄에 8개의 수가 차면 줄바꿈
                System.out.println();
                cnt=0;
            }
        }

    }
}
