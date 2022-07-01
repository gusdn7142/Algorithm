import java.util.Scanner;

public class Boj_2562 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[9];

        //9개의 값 입력
        int max = 0;
        int index = 0;

        for(int i=0; i<9; i++){
            arr[i] = scan.nextInt();

            if(max < arr[i]){
                max = arr[i];
                index = i+1;
            }

        }

        //최댓값과 최댓값이 몇번째 수인지 출력
        System.out.println(max);
        System.out.println(index);


    }






}
