import java.util.Scanner;



public class Boj_9095_2 {

    public static void main(String[] args) {



        //입력 설정
        Scanner scan = new Scanner(System.in);

        //출력 설정
        StringBuilder sb = new StringBuilder();

        //테스트 케이스 T 입력
        int T = scan.nextInt();


        //T만큼 반복
        while(T-->0) {

            //정수 n 입력
            int n = scan.nextInt();

            int result = brute(n,0);

            sb.append(result).append("\n");


        }

        System.out.println(sb);

    }



    public static int brute(int n, int sum){


        //sum이 n보다 클떄
        if(n < sum){
            return 0;
        }

        //sum과 n이 같으면
        if(n == sum){
            return 1;
        }

        //현재의 재귀 함수 상태에서 이후에 가능한 경우의 수를 모두 구한 뒤 반환!
        int ans = 0;
        for(int i=1; i <= 3; i++){
            ans += brute(n,sum+i);
        }
        return ans;

    }

}
