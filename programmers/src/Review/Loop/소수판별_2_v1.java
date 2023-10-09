package Review.Loop;

import java.util.Scanner;

public class 소수판별_2_v1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //자연수 n과 m 입력
        int n = scan.nextInt();
        int m = scan.nextInt();


        //n부터 m까지 반복
        for(int i=n; i<=m; i++){

            //카운트 변수 초기화
            int cnt = 0;

            if(i==1){     //i가 1이면 소수에서 제외
                cnt=1;
            }

            //i가 소수인지 판별
            for(int j=2; j<=i-1; j++){
                if(i%j==0){   //i가 소수가 아니면
                    cnt=1;
                    break;
                }
            }

            if(cnt==0){   //i가 소수이면 i 출력
                System.out.print(i + " ");
            }
        }
    }
}
