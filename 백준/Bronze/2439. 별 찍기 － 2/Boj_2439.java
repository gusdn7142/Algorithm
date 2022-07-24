import java.util.Scanner;

public class Boj_2439 {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i=1; i<=n; i++){

            //" " 출력
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }

            //* 출력
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
