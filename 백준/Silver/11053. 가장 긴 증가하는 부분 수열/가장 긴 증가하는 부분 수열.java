import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //수열 A의 개수
        int n = scan.nextInt();

        int d[] = new int[1001];   //부분 수열의 길이
        int a[] = new int[1001];   //수


        for(int i=0; i<n; i++){
            //수열 입력
            a[i] = scan.nextInt();

            d[i]=1;  //자기 자신밖에 없을떄 default값 1로 셋팅
        }


        int result = 1;  //부분 수열의 길이 구할떄 필요
        for(int i=0; i<n; i++){

            for(int j=0; j<i; j++) {
                if (a[j] < a[i] && d[i] < d[j]+1) {  //i가 j보다 크고, d[i]보다 d[j]+1이 클떄
                    d[i] = d[j]+1;
                }
            }

            result = Math.max(result,d[i]);   //d[i]와 이전 부분 수열의 길이를 비교

        }


        System.out.println(result);



    }







}
