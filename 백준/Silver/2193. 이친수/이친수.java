import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //자릿수(n) 입력
        int n = scan.nextInt();

        //d[91][2] 배열 생성
        long d[][] = new long[91][2];  //길이가 90, 자릿수는 0 혹은 1

        //초기값 셋팅
        d[1][0] = 0;  //0으로 시작 불가능하기 때문에 경우의 수는 0
        d[1][1] = 1;


        for(int i=2; i<=n; i++ ){

            //마지막 수가 0일떄의 이진수 개수
           d[i][0] = d[i-1][0] + d[i-1][1];

           //마지막 수가 1일때의 이진수 개수
           d[i][1] = d[i-1][0];

        }

        //길이가 N이고 마지막 수가 0과 1일떄의 이진수 개수
        System.out.println(d[n][0]+d[n][1]);

    }

}







