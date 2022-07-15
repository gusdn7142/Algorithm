import java.util.Scanner;

public class Boj_10871 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //정수 n과 x 입력
        int n = scan.nextInt();
        int x = scan.nextInt();

        //수열 A를 담을 arr[] 배열 생성
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();  //수열 입력

            if(arr[i] < x){  //수열과 x 비교
                sb.append(arr[i]).append(" ");
            }
        }

        System.out.println(sb);



    }



}
