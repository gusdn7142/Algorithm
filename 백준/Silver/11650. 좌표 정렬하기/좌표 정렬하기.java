import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int arr[][] = new int[n][2];

        for(int i=0; i<n; i++ ){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        Arrays.sort(arr, (e1,e2) -> {

            if(e1[0] == e2[0]) {   //x좌표 값이 같으면
                return Integer.compare(e1[1], e2[1]);  //y좌표의 차
            } else {
                return Integer.compare(e1[0], e2[0]);  //x좌표의 차
            }

        });


        for(int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }



    }





}
