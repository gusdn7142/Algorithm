import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        //n개의 배열 선언
        int[] arr = new int[n];


        //n개의 수를 배열에 입력
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }



        //소수 개수
        int cnt = 0;


        //배열을 하나씩 돌면서 소수인지 판별
        for (int i = 0; i < n; i++) {
            int j = 2;

            //arr[]배열이 j보다 크면 나누어 떨어지는지 확인
            for (; j < arr[i]; j++) {
                if (arr[i] % j == 0)
                    break;
            }

            //j와 arr[i]가 같을때만 카운트 증가
            if (j == arr[i]){
                cnt++;
            }


        }



        System.out.println(cnt);



    }




}
