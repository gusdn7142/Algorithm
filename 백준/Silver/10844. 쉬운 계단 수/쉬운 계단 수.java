import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //입력 설정
        Scanner scan = new Scanner(System.in);

        //츨력 설정
        StringBuffer sb = new StringBuffer();

        //계단 수 n 입력
        int n = scan.nextInt();

        //d[101][10] 배열 선언
        long d[][] = new long[101][10];

        //한 자리 수의 마지막 수인 i가 계단이 되는 경우의 수는 1가지 밖에 없으므로 1로 초기화.
        for(int i = 1; i <= 9; i++) {
            d[1][i] = 1;
        }

        //길이가 N인 게단수의 개수 구하기
        for(int i=2; i<=n; i++){

            for(int j=0; j<=9; j++){
                if(j == 0) {  //마지막 수 j가 0일떄
                    d[i][j] = d[i-1][j+1] % 1000000000;
                }
                else if(j == 9) {  //마지막 수 j가 9일떄
                    d[i][j] = d[i-1][j-1] % 1000000000;
                }
                else {
                    d[i][j] = (d[i-1][j-1] + d[i-1][j+1]) % 1000000000;  //길이 i, 마지막 수 j
                }

            }

        }

        long result = 0;
        for (int j=0; j<=9; j++){
            result += d[n][j];   //길이가 n이고 마지막 수가 0~9인 계단수의 경우의 수의 합
        }
        System.out.println(result % 1000000000);


    }




}
