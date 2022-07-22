import java.util.Scanner;

public class Boj_11022 {


    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        //테스트케이스 T 입력
        int T = scan.nextInt();

        for(int i=0; i<T; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b));
        }


    }






}
