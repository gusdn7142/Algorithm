import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        //p와 d배열 선언
        int[] d = new int[1001];
        int[] p = new int[10001];

        //P1부터 Pn까지의 비용 입력
        for (int i = 1; i <= n; i++) {
            p[i] = scan.nextInt();
        }

        //Pn의 최대비용 구하기
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                d[i] = Math.max(d[i], d[i-j] + p[j]);
            }
        }
        System.out.println(d[n]);

    }
}
