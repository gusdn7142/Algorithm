import java.util.Scanner;


public class Boj_2750_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        //오름차순 정렬
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }



}
