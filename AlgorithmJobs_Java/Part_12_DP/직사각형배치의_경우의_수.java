package Part_12_DP;

import java.util.Scanner;

public class 직사각형배치의_경우의_수 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //입력
        int n = scan.nextInt();  //직사각형의 가로 길이

        final int MAX = 105;
        int d[] = new int[MAX];  //2xi의 직사각형을 채우는 경우의 수를 저장하는 배열

        //변수 초기화
        d[1] = 1;  //2x1의 직사각형을 채우는 경우의 수
        d[2] = 2;   //2x2의 직사각형을 채우는 경우의 수


        //2xn의 직사각형을 채우는 경우의 수를 구하는 DP 로직
        for(int i=3; i<=n; i++){
            d[i] = d[i-1] + d[i-2];   //2xi의 직사각형을 채우는 경우의 수
            d[i] %= 1000007; //마지막 출력시에만 mod연산을 해줄 경우 int형의 Max값을 넘어 Overflow 가 발생할 수 있기 떄문에 d[i]를 구할때마다 적용
        }

        System.out.println(d[n]);  //2xn의 직사각형을 채우는 경우의 수

    }


}
