import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        //오름차순 정렬 적용
        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }





    }



}
