import java.util.Scanner;


public class 최대공약수와_최소공배수2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //두 정수 입력
        int a = scan.nextInt();
        int b = scan.nextInt();

        //최대공약수 출력
        int gcd = gcd(a,b);
        System.out.println(gcd);

        //최소공배수 출력
        int lcm = a*b/gcd;
        System.out.println(lcm);


    }

    //최대공약수 구하는 함수
    public static int gcd (int a, int b) {

        if (b == 0) {   //b가 0이면
            return a;   //a 리턴
        }
        else {
            return gcd(b, a%b);  //GCD(a,b) == GCD(b,a%b)
        }

    }






}
