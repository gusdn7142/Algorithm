import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception  {

        //입력 설정
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        //시간초과 : Scanner scan = new Scanner(System.in);

        //출력 설정
        StringBuilder sb = new StringBuilder();

        //테스트 케이스 T 입력
        int T = Integer.parseInt(br.readLine());  //scan.nextInt();

        //d[11] 배열 생성
        long d[][] = new long[100001][4];  //n의 최대 크기는 10이기 때문에 11


        d[1][1] = 1;  //1
        d[2][2] = 1;  //2
        d[3][1] = 1;  //2+1
        d[3][2] = 1;  //1+2
        d[3][3] = 1;  //3

        while(T-->0) {

            //정수 n 입력
            int n = Integer.parseInt(br.readLine());  //scan.nextInt();

            for (int i = 4; i <= n; i++) {   //3부터 n까지 반복
                d[i][1] = (d[i-1][2] + d[i-1][3]) % 1000000009;    //점화식 적용
                d[i][2] = (d[i-2][1] + d[i-2][3]) % 1000000009;    //점화식 적용
                d[i][3] = (d[i-3][1] + d[i-3][2]) % 1000000009;    //점화식 적용
            }
            //d[마지막으로 사용한 수][바로전에 사용한 수는 1,2,3]
            sb.append((d[n][1] + d[n][2] + d[n][3]) % 1000000009).append("\n");
        }


        System.out.println(sb);


    }





}
