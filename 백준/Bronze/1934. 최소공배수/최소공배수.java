import java.util.Scanner;

public class Main {

    //최대공약수 구하는 함수 (유클리드 호제법 사용)
    public static int gcd(int a, int b) {
        while(b!=0) {   //b가 0이 아니면
            int r = a % b;  //r(나머지) 구하기
            a = b;          //a는 b
            b = r;          //b는 r
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();  //출력 설정

        //테스트 케이스 T 입력
        int T = scan.nextInt();

        while(T-->0){

            //두 정수 a와 b 입력
            int a = scan.nextInt();
            int b = scan.nextInt();

            //최대공약수 구하기
            int gcd = gcd(a,b);

            //최소공배수 구하기
            int lcm = a*b/gcd;
            sb.append(lcm).append("\n");
        }

        System.out.println(sb); //최소공배수 출력
    }


}
