import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) throws IOException {

        //Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        //두 정수
        String[] arr = br.readLine().split(" ");  //숫자 m,n을 입력
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);

        //소수 구하기
        for(int i=m; i<=n; i++ ){
            if(prime(i) == true){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);

    }



    //소수 구하는 함수
    public static boolean prime(int n) {
        if (n <2) {        //1이면
            return false;  //소수가 아니다
        }
        for(int i=2; i<=Math.sqrt(n); i++) {    
            if (n % i == 0) {        //n을 i로 나눈 나머지가 0이면
                return false;   //소수가 아니다.
            }
        }
        return true;   //소수이다.
    }




}