import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //입력받을 수의 개수 n
        int n = scan.nextInt();


        //a[1001] 배열 선언
        int a[] = new int[100001];
        int d[] = new int[100001];

        //수 입력
        for(int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }

        //초기값 셋팅
        d[0] = a[0];
        int max_result = d[0];

        for(int i=1; i<n; i++){

            //i-1번까지의 연속합과 i번쨰 수를 비교하여
            if( d[i-1]+a[i] > a[i] ){   //i-1번까지의 연속합과 i번째수의 합이 i번쨰 수보다 크면
                d[i] = d[i-1]+a[i];
            }
            else{   //i-1번까지의 연속합과 i번쨰 수의 합입 i번쨰 수보다 작으면
                d[i] = a[i];
            }

            //연속합 중 가장 큰 값 구하기
            if(max_result < d[i]){
                max_result = d[i];
            }

        }


        System.out.println(max_result);




    }





}
