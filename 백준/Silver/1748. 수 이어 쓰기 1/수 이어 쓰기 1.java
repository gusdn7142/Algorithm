import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //정수 N 입력
        int n = scan.nextInt();

        //새로운 수의 자릿수
        int answer = 0;

        //자릿수를 몇개씩 카운트 해줄지 결정
        int cnt = 1;

        //자릿수(10.. 100.. 1000...)
        int len = 10;

        for (int i=1; i<=n; i++){  //n만큼 반복을 진행

            if(i==len) {  //i가 10... 100... 1000.... 이면
                len *= 10;
                cnt++;
            }
            answer += cnt;

        }

        System.out.println(answer);


    }


}