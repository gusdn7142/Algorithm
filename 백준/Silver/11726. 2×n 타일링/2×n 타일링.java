import java.util.Scanner;

/* 2×n 크기의 직사각형을 채우는 방법의 수 */
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //정수 n 입력
        int n = scan.nextInt();

        //d[] 배열 생성
        int d[] = new int[1001];  //n의 최대 크기는 1000이기 때문에 1001

        d[1] = 1;  //2*1의 직사각형을 채우는 방법 : 1가지
        d[2] = 2;  //2*2의 직사각형을 채우는 방법 : 2가지

        for(int i=3; i<=n; i++) {   //3부터 n까지 반복

            d[i] = d[i - 1] + d[i - 2];   //점화식 적용
            d[i] %= 10007;
        }

        System.out.println(d[n]);


    }



}
