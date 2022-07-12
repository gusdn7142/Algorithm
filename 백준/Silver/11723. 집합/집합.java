import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws IOException{

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //연산의 수 M
        int m = scan.nextInt();

        //공집합
        int s = 0;

        while (m--> 0) {

            //연산 입력
            String line = scan.next();

            if (line.equals("add")) {   //or연산
                int x = scan.nextInt();
                s = (s | (1 << x));

            } else if (line.equals("remove")) {   //and 연산
                int x=scan.nextInt();
                s = (s & ~(1<<x));

            } else if (line.equals("check")) {    //and 연산
                int x=scan.nextInt();
                int res = (s & (1 << x));

                if (res == 0) {
                    sb.append("0 \n");
                } else {
                    sb.append("1 \n");
                }

            } else if (line.equals("toggle")) {  //xor 연산
                int x=scan.nextInt();
                s = (s ^ (1 << x));

            } else if (line.equals("all")) {  //모든 비트 체크
                s = (1 << 21) - 1;
            } else if (line.equals("empty")) {  //공집합
                s = 0;
            }
        }

        //연산 결과 출력
       System.out.println(sb);



    }









}
