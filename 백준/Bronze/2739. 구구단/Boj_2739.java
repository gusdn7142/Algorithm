import java.util.Scanner;

public class Boj_2739 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //정수 n 입력
        int n = scan.nextInt();
        
        //구구단 계산
        for(int i=1; i<=9; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }

    }
}
