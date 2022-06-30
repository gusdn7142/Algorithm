import java.io.IOException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {

        //입력 설정
        Scanner scan = new Scanner(System.in);

        //출력 설정
        StringBuilder sb = new StringBuilder();

        //테스트 케이스 T 입력
        int T = scan.nextInt();

        //d[11] 배열 생성
        int d[] = new int[11];  //n의 최대 크기는 10이기 때문에 11



        d[1] = 1;  //1을 만드는 경우의 수 : 1가지
        d[2] = 2;  //2를 만드는 경우의 수: 1가지
        d[3] = 4;  //3을 만드는 경우의 수 : 4가지

        while(T-->0) {

            //정수 n 입력
            int n = scan.nextInt();

            for (int i = 4; i <= n; i++) {   //3부터 n까지 반복

                d[i] = d[i - 1] + d[i - 2] + d[i - 3];   //점화식 적용
            }

            sb.append(d[n]).append("\n");
        }


        System.out.println(sb);


    }

}
