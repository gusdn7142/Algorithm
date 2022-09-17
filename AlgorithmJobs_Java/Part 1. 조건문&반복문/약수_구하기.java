package Part_1_조건문and반복문;

import java.util.Scanner;

public class 약수_구하기 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int cnt = 0;   //약수의 개수
        int flag = 0;   //k번째 약수가 존재하는지 확인

        for(int i=1; i<=n; i++){
            if(n%i==0){  //i번째 약수가 존재하면
                cnt++;
            }

            if(cnt==k){  //cnt가 k와 같으면, 즉, k번째 약수이면
                System.out.println(i);   //약수 출력
                flag=1;
                break;
            }
        }

        if(flag==0){   //k번째 약수가 없다면
            System.out.println("0");   //0 출력
        }
    }
}
