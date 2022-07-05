import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //팩토리얼 n 입력
        int n = sc.nextInt();


        int result = 0;


        //5의 개수 카운트 (5가 2번 들어가는 경우도 고려)
        for (int i=5; i<=n; i*=5) {
            result += n/i;        
        }


        System.out.println(result); //팩토리얼 0의 개수 출력


    }


}
