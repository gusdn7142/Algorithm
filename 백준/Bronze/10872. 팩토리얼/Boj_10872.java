import java.util.Scanner;

public class Boj_10872 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();


        int p=1;
        //while(n-->1){  //n-1부터 시작한다....
        for(int i=n; i>0; i--) {  //n이 1이 될때까지 반복
            p*=i;       //n팩토리얼 출력
        }
        System.out.println(p);


    }



}
