package Part_1_조건문and반복문;

import java.util.Scanner;

public class 소수_판별 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int flag = 0;

        for(int i=2; i<=n-1; i++){   //2부터 n까지 반복하면서 (1과 n은 제외)
            if(n%i==0){  //소수가 아니라면 (n이 i로 나누어 떨어지면)
                flag = 1;
            }
        }

        if(flag==0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
}
