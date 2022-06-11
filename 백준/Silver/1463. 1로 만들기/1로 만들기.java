import java.util.Scanner;


/* 3가지 연산(/3, /2, -1)으로 N을 1로 만드는 최소 연산 횟수를 구하기 */
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //정수 n 입력
        int n = scan.nextInt();

        //d[i] = i를 1로 만드는 최소 연산 횟수
        int d[] = new int[n+1];   //크기에 +1
        d[1] = 0;   //1을 1로만드는 경우의 수는 0

        //2부터 n까지 반복
        for (int i=2; i<=n; i++) {

            //연산1 : -1
            d[i] = d[i-1] + 1;

            //연산2 : %2
            if (i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }

            //연산3 : %3
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }


        }
        System.out.println(d[n]);


    }



}
