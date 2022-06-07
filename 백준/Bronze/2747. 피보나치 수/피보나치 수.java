import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //피보나치 배열 생성
        int arr[] = new int[46];

        arr[0]=0;  //n(0)=0
        arr[1]=1;  //n(1)=1
        
        //피보나치 수 구하기
        for(int i=2; i<=n; i++){         //2부터 n까지 반복
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n]);  //피보나치 수 출력
    }

}
